package com.hjy.dao;

import com.hjy.model.Sc;
import com.hjy.util.Pagination;

import java.util.List;

public interface IScDao {
    public List<Sc> getAllSc(Pagination pagination);
	
	public void getGrade(String sno, String cno);
	public void deleteGrade(String sno, String cno);
	public void updateGrade(String sno, String cno);
	public void getStudentGrade(String sno);
}