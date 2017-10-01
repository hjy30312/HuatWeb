package com.hjy.dao;

import com.hjy.model.User;

public interface IUserDao {
    /**
     * 通过用户名得到数据库中user信息
     * @param username
     * @return
     */
    public User getUser(String username);
}
