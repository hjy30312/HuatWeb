package com.hjy.dao;

import com.hjy.model.Course;
import com.hjy.util.Pagination;
import java.util.List;

public interface ICourseDao {
    public List<Course> getAllCourse();

	public Course cnoGetCourse(String cno);
	
	public Course cnameGetCourse(String cname);
	
	public void insertCourse(Course course);

	public void deleteCourse(String cno);

	public void updateCourse(Course course);

	public List<Course> getAllCourse(Pagination pagination);
}