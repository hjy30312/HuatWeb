package com.hjy.servlet.student;


import com.hjy.model.Student;
import com.hjy.util.MyFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 何金洋
 */
@WebServlet(name = "GetStudent", urlPatterns = {"/GetStudent"})
public class GetStudent extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String sno = request.getParameter("sno");
        /**
         * 因为在displayStudnet.jsp中的items="${students}"
         * 是List类型  所以得到的stu需要转换类型
         */
        Student stu = MyFactory.getStudentDao().getStudent(sno);
        List <Student> students = new ArrayList<Student>();
        students.add(stu);
        request.setAttribute("students", students);
        
        //第一种方式:转发 携带数据 地址栏不发生变化
        request.getRequestDispatcher("displayStudent.jsp").forward(request, response);
    }
        
    
    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
