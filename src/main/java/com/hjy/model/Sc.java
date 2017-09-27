/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hjy.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class Sc {
    private String sno;     //学号
	private String cno;		//课程编号
	private double grade;	//成绩
	private Double averageGrade;   //平均成绩
	private int courseCount;	//选修课程数
    //Student student;
    //Course course;
    
    public Sc() {
    	
    }

	public Sc(String sno, String cno, double grade, Double averageGrade, int courseCount) {
		this.sno = sno;
		this.cno = cno;
		this.grade = grade;
		this.averageGrade = averageGrade;
		this.courseCount = courseCount;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public Double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(Double averageGrade) {
		this.averageGrade = averageGrade;
	}

	public int getCourseCount() {
		return courseCount;
	}

	public void setCourseCount(int courseCount) {
		this.courseCount = courseCount;
	}
}
