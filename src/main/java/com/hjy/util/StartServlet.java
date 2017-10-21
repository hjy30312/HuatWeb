package com.hjy.util;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.*;

/**
 *
 * 进行文件的配置
 * @author hjy
 * @create 2017/10/20
 **/
public class StartServlet extends HttpServlet{
    @Override
    public void init() throws ServletException {
        try {
            String path = this.getServletContext().getRealPath("../resourse/config/factory.properties");
            InputStream in = new BufferedInputStream(new FileInputStream(path));
            MyFactory.properties.load(in);
            in.close();
            System.out.println("StartServlet");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
