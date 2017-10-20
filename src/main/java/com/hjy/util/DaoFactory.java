package com.hjy.util;

import com.hjy.dao.ICourseDao;
import com.hjy.dao.IScDao;
import com.hjy.dao.IStudentDao;
import com.hjy.dao.IUserDao;
import com.hjy.dao.impl.CourseDao;
import com.hjy.dao.impl.ScDao;
import com.hjy.dao.impl.StudentDao;
import com.hjy.dao.impl.UserDao;

import java.util.Properties;

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






    public static Properties properties = new Properties();

    public static Object getObject(String name) {
        System.out.println(name);
        String className = properties.getProperty(name);
        Object obj = null;
        try {
            obj = Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
