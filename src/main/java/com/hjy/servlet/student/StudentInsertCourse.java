package com.hjy.servlet.student;

import com.hjy.model.Student;
import com.hjy.util.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "StudentInsertCourse" ,urlPatterns = {"/StudentInsertCourse"})
public class StudentInsertCourse extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        proceesRequest(request, response);
    }

    private void proceesRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession();
        Student student = (Student)session.getAttribute("student");
        String sno = student.getSno();

        String cno = request.getParameter("cno");
        DaoFactory.getStudentDao().studentInsertCourse(sno,cno);
        //重定向
        response.sendRedirect(request.getContextPath() + "/CourseManagement");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        proceesRequest(request, response);
    }
}
