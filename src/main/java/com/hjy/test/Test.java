package com.hjy.test;

import com.hjy.dao.impl.StudentDao;
import com.hjy.model.Course;
import com.hjy.util.MyFactory;

import java.util.Map;

public class Test
{
    public static void main(String[] args) {

        Map<Course,Double> map = MyFactory.getStudentDao().getStudentCourse("9512101");
        for (Course course:map.keySet()) {
            System.out.println(course.getCname() + "----->" + map.get(course));
        }

        MyFactory.getStudentDao().studentInsertCourse("9512101",	"020630");

    }
}
