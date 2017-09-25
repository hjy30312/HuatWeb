package com.hjy.servlet.student;


import com.hjy.model.Student;
import com.hjy.util.DaoFactory;
import com.hjy.util.Pagination;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DisplayStudent", urlPatterns = {"/DisplayStudent"})
public class DisplayStudent extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String pageNo = request.getParameter("pageNo");
        int page = 1;
        if(pageNo != null) {
            page = Integer.parseInt(pageNo);
        }
        
        Pagination pagination = new Pagination();
        pagination.setPageNo(page);
        pagination.setUrl("DisplayStudent?");
        
        List<Student> students = DaoFactory.getStudentDao().getAllStudent(pagination);
        request.setAttribute("students", students);
        request.setAttribute("pagination", pagination);
        
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
