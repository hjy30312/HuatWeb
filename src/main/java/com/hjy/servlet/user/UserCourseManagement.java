package com.hjy.servlet.user;

import com.hjy.model.Course;
import com.hjy.model.Student;
import com.hjy.util.DaoFactory;
import com.hjy.util.DatabaseBean;
import com.hjy.util.Pagination;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserCourseManagement", urlPatterns = "/UserCourseManagement")
public class UserCourseManagement extends HttpServlet {
    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");

        String pageNo = request.getParameter("pageNo");
        int page = 1;
        if(pageNo != null) {
            page = Integer.parseInt(pageNo);
        }

        Pagination pagination = new Pagination();
        pagination.setPageNo(page);
        pagination.setUrl("UserCourseManagement?");
        List<Course> courses = DaoFactory.getCourseDao().getAllCourse(pagination);
        request.setAttribute("courses", courses);
        request.setAttribute("pagination", pagination);

        //request.getRequestDispatcher("displayStudent.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
