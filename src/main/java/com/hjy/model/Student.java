package com.hjy.model;

/**
 * 学生模型类
 * @author Administrator
 */
public class Student {
    String sno;
    String sname;
    String password;
    String ssex;
    int sage;
    String sdept;
    double savggrade;
    String photo_url;
    
    public Student() {
    }
    
    public Student(String sno, String sname, String password, String ssex, int sage, String sdept, double savggrade,
			String photo_url) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.password = password;
		this.ssex = ssex;
		this.sage = sage;
		this.sdept = sdept;
		this.savggrade = savggrade;
		this.photo_url = photo_url;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public String getSdept() {
		return sdept;
	}

	public void setSdept(String sdept) {
		this.sdept = sdept;
	}

	public double getSavggrade() {
		return savggrade;
	}

	public void setSavggrade(double savggrade) {
		this.savggrade = savggrade;
	}

	public String getPhoto_url() {
		return photo_url;
	}

	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}


	



    
    
}
