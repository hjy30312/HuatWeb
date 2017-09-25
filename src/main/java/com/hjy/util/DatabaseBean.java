package com.hjy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 封装数据库连接对象方法和关闭数据库连接对象方法
 *
 * @author Administrator
 */
public class DatabaseBean {

    //ctrl + shift + o 组织导入
    public static Connection getConnection() {
        Connection conn = null;
        String driver = "oracle.jdbc.driver.OracleDriver";
        final String url = "jdbc:oracle:thin:@localhost:1521:xe";
        final String username = "hr";
        final String password = "oracle";
        try {
        	//JDBC
        	//1.加载驱动程序
            Class.forName(driver);
            //2.获得数据库的连接
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;

    }

    public static void close(ResultSet rs, Statement stmt, Connection conn) {

        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBean.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
