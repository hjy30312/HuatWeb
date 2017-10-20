package com.hjy.servlet;

import com.hjy.model.Student;
import com.hjy.util.MyFactory;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "RevisePassword", urlPatterns = {"/RevisePassword"})
public class RevisePassword extends HttpServlet {
    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException {
        response.setContentType("text/html;charset=UTF-8");
        Student student = new Student();
        HttpSession session = request.getSession();
        student = (Student)session.getAttribute("student");

        String oldPassword = request.getParameter("oldPassword");
        String newPassword = request.getParameter("newPassword");

        String sno = student.getSno();

        System.out.println("密码修改前：" + oldPassword);
        /**
         * 原密码正确，则修改密码返回用户界面
         * 否则回到修改密码界面
         */
        if (oldPassword.equals(student.getPassword())) {
            student.setPassword(newPassword);
            MyFactory.getStudentDao().updateStudent(student);
            student = MyFactory.getStudentDao().getStudent(sno);
            System.out.println("密码修改后：" + student.getPassword());
            response.sendRedirect(request.getContextPath() + "/StudentIndex.jsp");
        } else {
            response.sendRedirect(request.getContextPath() + "/RevisePassword.jsp");
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
}
