package com.hjy.dao;

import com.hjy.model.Student;
import com.hjy.util.Pagination;
import java.util.List;

public interface IStudentDao {
    public List<Student> getAllStudent();

	public Student getStudent(String sno);

	public void insertStudent(Student stu);

	public void deleteStudent(String sno);

	public void updateStudent(Student stu);

	public List<Student> getAllStudent(Pagination pagination);
}