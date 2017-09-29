package com.hjy.test;

import com.hjy.model.Course;
import com.hjy.util.DaoFactory;

import java.util.Map;

public class Test
{
    public static void main(String[] args) {

        Map<Course,Double> map = DaoFactory.getStudentDao().getStudentCourse("9512101");
        for (Course course:map.keySet()) {
            System.out.println(course.getCname() + "----->" + map.get(course));
        }

        DaoFactory.getStudentDao().studentInsertCourse("9512101",	"020630");

    }
}
