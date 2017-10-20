package com.hjy.servlet.student;

import com.hjy.model.Course;
import com.hjy.model.Student;
import com.hjy.util.MyFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "CourseManagement", urlPatterns = {"/CourseManagement"})
public class CourseManagement extends HttpServlet {

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        Student student = (Student)session.getAttribute("student");
        String sno = student.getSno();
        Map<Course,Double> map = MyFactory.getStudentDao().getStudentCourse(sno);
        List<Course> studentNoCourse = MyFactory.getStudentDao().getStudentNoCourse(sno);
        session.setAttribute("sno", sno);
        session.setAttribute("map", map);
        session.setAttribute("studentNoCourse", studentNoCourse);

        //重定向  地址栏发生变化
        response.sendRedirect(request.getContextPath() + "/CourseManagement.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
