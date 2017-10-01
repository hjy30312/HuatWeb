package com.hjy.dao.impl;

import com.hjy.dao.IUserDao;
import com.hjy.model.Course;
import com.hjy.model.User;
import com.hjy.util.DatabaseBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDao implements IUserDao{
    Connection conn = null;  //数据库连接，负责进行与数据库间的通讯
    PreparedStatement psmt = null;  //用以执行包含动态参数的SQL查询和更新（在服务器端编译，允许重复执行以提高效率）。,继承Statement
    ResultSet rs = null; //数据库结果集的数据表,具有指向其当前数据行的指针


    @Override
    public User getUser(String username) {
        User user = null;
        try {
            conn = DatabaseBean.getConnection();
            String sql = "select * from tb_user where username=?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, username);
            rs = psmt.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return user;
    }


    @Override
    public List<Course> getAllCourse() {
        List<Course> courses = new ArrayList<Course>();
        try {
          conn = DatabaseBean.getConnection();
          String sql = "select * from tb_users";
          psmt = conn.prepareStatement(sql);
          rs = psmt.executeQuery();
          while (rs.next()) {
              Course course = new Course();
              course.setCno(rs.getString("cno"));
              course.setCname(rs.getString("cname"));
              course.setCpno(rs.getString("cpno"));
              course.setCcredit(rs.getDouble("ccredit"));
              course.setPeriod(rs.getInt("period"));
              course.setTheory(rs.getInt("theory"));
              course.setExperiment(rs.getInt("experiment"));
              courses.add(course);
          }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courses;
    }
}
