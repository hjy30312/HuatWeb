package com.hjy.dao;

import com.hjy.model.Course;
import com.hjy.model.Student;
import com.hjy.util.Pagination;
import java.util.List;
import java.util.Map;


public interface IStudentDao {

    public List<Student> getAllStudent();

	public Student getStudent(String sno);

	public void insertStudent(Student stu);

	public void deleteStudent(String sno);

	public void updateStudent(Student stu);


	public List<Student> getAllStudent(Pagination pagination);

	/**
	 * 得到学生已选择的课程的信息
	 * @param sno
	 */
	public Map<Course,Double> getStudentCourse(String sno);

	/**
	 * 得到学生没有选择的课程的信息
	 * @param sno
	 * @return
	 */
	public List<Course> getStudentNoCourse(String sno);

	/**
	 * 学生进行选课
	 * @param sno
	 * @param cno
	 */
	public void studentInsertCourse(String sno,String cno);

}