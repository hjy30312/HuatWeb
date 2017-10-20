package com.hjy.dao.impl;

import com.hjy.dao.ICatergory;
import com.hjy.model.Category;
import com.hjy.util.DatabaseBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CategoryDaoImpl implements ICatergory {
    /**
     * 数据库连接，负责进行与数据库间的通讯
     */
    Connection conn = null;
    /**
     *   用以执行包含动态参数的SQL查询和更新（在服务器端编译，允许重复执行以提高效率）。,继承Statement
     */
    PreparedStatement psmt = null;
    /**
     *  数据库结果集的数据表,具有指向其当前数据行的指针
     */
    ResultSet rs = null;

    @Override
    public List<Category> selectAll() {
        List<Category> categoryList = new ArrayList<Category>();
        try {
            conn = DatabaseBean.getConnection();
            String sql = "select * from tb_category";
            psmt = conn.prepareStatement(sql);
            while (rs.next()) {
                Category category = new Category();
                category.setCid(rs.getInt("cid"));
                category.setCatename(rs.getString("catename"));
                category.setDescription(rs.getString("description"));
                category.setCount(rs.getInt("count"));
                categoryList.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DatabaseBean.close(rs,psmt,conn);
        }
        return categoryList;
    }
}
