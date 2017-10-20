package com.hjy.servlet.student;


import com.hjy.model.Student;
import com.hjy.util.MyFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InsertStudent", urlPatterns = {"/InsertStudent"})
public class InsertStudent extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //request.setCharacterEncoding("UTF-8");//只针对post方式起作用
        
        String sno = request.getParameter("sno");
        String sname = request.getParameter("sname");
        String ssex = request.getParameter("ssex");
        String sage = request.getParameter("sage");
        String sdept = request.getParameter("sdept");
        String password  = "96e79218965eb72c92a549dd5a330112";
        double savggrade = 0.0;
        String photo_url = "nopic.png";
        Student stu = new Student();
        stu.setSno(sno);
        stu.setSname(sname);
        stu.setSsex(ssex);
        stu.setSage(Integer.parseInt(sage));
        stu.setSdept(sdept);
        stu.setPassword(password);
        stu.setSavggrade(savggrade);
        stu.setPhoto_url(photo_url);
        MyFactory.getStudentDao().insertStudent(stu);
        //第二种方式:重定向 地址栏发生变化
        response.sendRedirect(request.getContextPath() + "/DisplayStudent");
        
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
