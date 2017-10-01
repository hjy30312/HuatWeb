package com.hjy.dao;

import com.hjy.model.Course;
import com.hjy.model.User;

import java.util.List;

public interface IUserDao {
    /**
     * 通过用户名得到数据库中user信息
     * @param username
     * @return
     */
    public User getUser(String username);

    /**
     * 得到所有的课程信息
     * @return
     */
    public List<Course> getAllCourse();
}
