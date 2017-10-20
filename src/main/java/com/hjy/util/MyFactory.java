package com.hjy.util;

import com.hjy.dao.*;
import com.hjy.dao.impl.*;
import com.hjy.service.ICatergoryService;
import com.hjy.service.impl.CatergoryServiceImpl;

import java.util.Properties;

public class MyFactory {

    public static ICatergory getCategoryDao() {return new CategoryDaoImpl();}
    public static IStudentDao getStudentDao() { return new StudentDao(); }
    public static ICatergoryService getCatergoryService() {return new CatergoryServiceImpl();}
    public static ICourseDao getCourseDao() {
        return new CourseDao();
    }
    public static IScDao getScDao() {
        return new ScDao();
    }
    public static IUserDao getUserDao() {return  new UserDao();}






    public static Properties properties = new Properties();

    public static Object getObject(String name) {

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
