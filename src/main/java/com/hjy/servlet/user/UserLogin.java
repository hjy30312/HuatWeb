package com.hjy.servlet.user;

import com.hjy.model.Student;
import com.hjy.model.User;
import com.hjy.util.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "UserLogin", urlPatterns = {"/UserLogin"})
public class UserLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");

        String userName =request.getParameter("username");
        String password = request.getParameter("password");
        User user = DaoFactory.getUserDao().getUser(userName);

        if (user != null) {
            if (password.equals(user.getPassword())) {
                //将user放入session
                HttpSession session = request.getSession();
                session.setAttribute("user", user);

                //重定向 地址栏发生变化 不共享同一个request
                response.sendRedirect(request.getContextPath() + "/UserIndex.jsp");
            } else {
                //转发 携带数据 地址栏不发生变化 共享同一个request
                request.setAttribute("msg", "用户名或密码错误");
                request.getRequestDispatcher("UserLogin.jsp").forward(request,response);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
