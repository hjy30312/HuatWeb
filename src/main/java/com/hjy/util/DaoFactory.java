package com.hjy.util;

import com.hjy.dao.ICourseDao;
import com.hjy.dao.IScDao;
import com.hjy.dao.IStudentDao;
import com.hjy.dao.IUserDao;
import com.hjy.dao.impl.CourseDao;
import com.hjy.dao.impl.ScDao;
import com.hjy.dao.impl.StudentDao;
import com.hjy.dao.impl.UserDao;

public class DaoFactory {
    
    public static IStudentDao getStudentDao() {
        return new StudentDao();
    }

    public static ICourseDao getCourseDao() {
        return new CourseDao();
    }
    public static IScDao getScDao() {
        return new ScDao();
    }
    public static IUserDao getUserDao() {return  new UserDao();}
}
