package com.hjy.model;

/**
 *
 * @author Administrator
 */
public class Course {
    String cno;     //课程编号
    String cname;   //课程名
    String cpno;    //前导课
    Double ccredit; //学分
    int period;     //总学时
    int theory;     //理论学时
    int experiment; //实验学时
    
    public Course(){
        
    }
    
    public Course(String cno, String cname, String cpno, Double ccredit, int period, int theory, int experiment) {
        this.cno = cno;
        this.cname = cname;
        this.cpno = cpno;
        this.ccredit = ccredit;
        this.period = period;
        this.theory = theory;
        this.experiment = experiment;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCpno() {
        return cpno;
    }

    public void setCpno(String cpno) {
        this.cpno = cpno;
    }

    public Double getCcredit() {
        return ccredit;
    }

    public void setCcredit(Double ccredit) {
        this.ccredit = ccredit;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getTheory() {
        return theory;
    }

    public void setTheory(int theory) {
        this.theory = theory;
    }

    public int getExperiment() {
        return experiment;
    }

    public void setExperiment(int experiment) {
        this.experiment = experiment;
    }

    
    
}
