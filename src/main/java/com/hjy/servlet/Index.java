package com.hjy.servlet;

import com.hjy.model.Category;
import com.hjy.service.ICatergoryService;
import com.hjy.util.MyFactory;
import com.hjy.util.Pagination;
import org.omg.CORBA.PRIVATE_MEMBER;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Index", urlPatterns = {"/Index"})
public class Index extends HttpServlet {


    private final ICatergoryService catergoryService = MyFactory.getCatergoryService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        try {
            Pagination pagination = new Pagination();
            pagination.setPageNo(1);
            List<Category> categories = catergoryService.findAllCategory();
            request.setAttribute("categories", categories);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
