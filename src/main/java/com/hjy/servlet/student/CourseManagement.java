package com.hjy.servlet.student;

import com.hjy.model.Course;
import com.hjy.util.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "CourseManagement", urlPatterns = {"/CourseManagement"})
public class CourseManagement extends HttpServlet {

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        Map<Course,Double> map = DaoFactory.getStudentDao().getStudentCourse("9512101");
        HttpSession session = request.getSession();
        session.setAttribute("map", map);
        //重定向  地址栏发生变化
        response.sendRedirect(request.getContextPath() + "/CourseManagement.jsp");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
