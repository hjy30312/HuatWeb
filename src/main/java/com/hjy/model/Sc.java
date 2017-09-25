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
    String sno;     //学号
    String name;	//姓名
    Map<String,Double> sg = new HashMap<String,Double>(); //课程号和成绩
    Map<String,String> sc = new HashMap<String,String>(); //课程号和课程名
    Double averageGrade;   //平均成绩
    int courseCount;	//选修课程数
    //Student student;
    //Course course;
    
    public Sc() {
    	
    }
    
    public Sc(String sno, String name, Map<String, Double> sg, Map<String, String> sc, Double averageGrade,
    		int courseCount) {
    	super();
    	this.sno = sno;
    	this.name = name;
    	this.sg = sg;
    	this.sc = sc;
    	this.averageGrade = averageGrade;
    	this.courseCount = courseCount;
    }
    
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Double> getSg() {
		return sg;
	}
	public void setSg(Map<String, Double> sg) {
		this.sg = sg;
	}
	public Map<String, String> getSc() {
		return sc;
	}
	public void setSc(Map<String, String> sc) {
		this.sc = sc;
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
