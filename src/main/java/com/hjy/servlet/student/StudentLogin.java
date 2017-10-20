package com.hjy.servlet.student;

import com.hjy.model.Student;
import com.hjy.util.MyFactory;
import org.springframework.ui.ModelMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "StudentLogin", urlPatterns = {"/StudentLogin"})
public class StudentLogin extends HttpServlet {


    private void processRequest(HttpServletRequest request,
                                HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String sno = request.getParameter("sno");
        String password = request.getParameter("password");
        System.out.println("登录：" + sno  + " " + password);
        Student student = MyFactory.getStudentDao().getStudent(sno);

        if (student != null) {  //有这个学号
            System.out.println("数据库："+ student.getSname() + " " +student.getSno() + " " + student.getPassword());
            if (student.getPassword().equals(password)) {
                //将Student放入session中
                HttpSession session = request.getSession();
                session.setAttribute("student", student);

                //第二种方式:重定向 地址栏发生变化
                response.sendRedirect(request.getContextPath() + "/StudentIndex.jsp");
            } else {
                //第一种方式:转发 携带数据 地址栏不发生变化
                request.setAttribute("msg", "用户名或密码错误");
                request.getRequestDispatcher("StudentLogin.jsp").forward(request, response);
            }
        } else {

            //第一种方式:转发 携带数据 地址栏不发生变化
            request.setAttribute("msg", "用户名或密码错误");
            request.getRequestDispatcher("StudentLogin.jsp").forward(request, response);
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
