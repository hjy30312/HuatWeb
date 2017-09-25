package com.hjy.dao.impl;

import com.hjy.dao.ICourseDao;
import com.hjy.model.Course;
import com.hjy.util.DatabaseBean;
import com.hjy.util.Pagination;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class CourseDao implements ICourseDao {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	@Override
	public List<Course> getAllCourse() {
		List<Course> courses = new ArrayList<Course>();
		try {
			conn = DatabaseBean.getConnection();
			psmt = conn.prepareStatement("select * from tb_course");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Course course = new Course();
				course.setCno(rs.getString("cno"));
				course.setCname(rs.getString("cname"));
				course.setCpno(rs.getString("spno"));
				course.setCcredit(rs.getDouble("ccredit"));
				course.setPeriod(rs.getInt("period"));
				course.setTheory(rs.getInt("theory"));
				course.setExperiment(rs.getInt("experiment"));
				courses.add(course);
			}
		} catch (SQLException ex) {
			Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return courses;
	}

	@Override
	public Course cnoGetCourse(String cno) {
		Course course = null;
		try {
			conn = DatabaseBean.getConnection();
			psmt = conn.prepareStatement("select * from tb_course where cno=?");
			psmt.setString(1, cno);
			rs = psmt.executeQuery();
			if (rs.next()) {
				course = new Course();
				course.setCno(rs.getString("cno"));
				course.setCname(rs.getString("cname"));
				course.setCpno(rs.getString("cpno"));
				course.setCcredit(rs.getDouble("ccredit"));
				course.setPeriod(rs.getInt("period"));
				course.setTheory(rs.getInt("theory"));
				course.setExperiment(rs.getInt("experiment"));

			}
		} catch (SQLException ex) {
			Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			DatabaseBean.close(rs, psmt, conn);
		}
		return course;
	}

	public Course cnameGetCourse(String cname) {
		Course course = null;
		try {
			conn = DatabaseBean.getConnection();
			psmt = conn.prepareStatement("select * from tb_course where cname=?");
			psmt.setString(1, cname);
			rs = psmt.executeQuery();
			if (rs.next()) {
				course = new Course();
				course.setCno(rs.getString("cno"));
				course.setCname(rs.getString("cname"));
				course.setCpno(rs.getString("cpno"));
				course.setCcredit(rs.getDouble("ccredit"));
				course.setPeriod(rs.getInt("period"));
				course.setTheory(rs.getInt("theory"));
				course.setExperiment(rs.getInt("experiment"));

			}
		} catch (SQLException ex) {
			Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			DatabaseBean.close(rs, psmt, conn);
		}
		return course;
	}

	@Override
	public void insertCourse(Course course) {
		try {
			conn = DatabaseBean.getConnection();
			psmt = conn.prepareStatement("insert into tb_course values(?,?,?,?,?,?,?)");
			psmt.setString(1, course.getCno());
			psmt.setString(2, course.getCname());
			psmt.setString(3, course.getCpno());
			psmt.setDouble(4, course.getCcredit());
			psmt.setInt(5, course.getPeriod());
			psmt.setInt(6, course.getTheory());
			psmt.setInt(7, course.getExperiment());
			psmt.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	@Override
	public void deleteCourse(String cno) {
		try {
			conn = DatabaseBean.getConnection();
			psmt = conn.prepareStatement("delete from tb_course where cno=?");
			psmt.setString(1, cno);
			psmt.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			DatabaseBean.close(rs, psmt, conn);
		}
	}

	@Override
	public void updateCourse(Course course) {
		try {
			conn = DatabaseBean.getConnection();
			psmt = conn.prepareStatement(
					"update tb_course set cname=?,spno=?,ccredit=?,period=?,theory=?,experiment=? where cno=? ");
			psmt.setString(1, course.getCname());
			psmt.setString(2, course.getCpno());
			psmt.setDouble(3, course.getCcredit());
			psmt.setInt(4, course.getPeriod());
			psmt.setInt(5, course.getTheory());
			psmt.setInt(6, course.getExperiment());
			psmt.setString(7, course.getCno());
			psmt.executeUpdate();
		} catch (SQLException ex) {
			Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			DatabaseBean.close(rs, psmt, conn);
		}
	}

	@Override
	public List<Course> getAllCourse(Pagination pagination) {
		List<Course> courses = new ArrayList<Course>();
		try {
			conn = DatabaseBean.getConnection();
			psmt = conn.prepareStatement("select count(*) as counts from tb_course");
			rs = psmt.executeQuery();
			rs.next();
			// 求总记录数
			pagination.setCountSize(rs.getInt("counts"));
			int start = (pagination.getPageNo() - 1) * pagination.getPageSize() + 1;// 开始位置
			int end = pagination.getPageNo() * pagination.getPageSize();// 结束位置
			
			psmt = conn.prepareStatement(
					"SELECT * FROM (SELECT ROWNUM NO , c.* FROM (SELECT * FROM tb_course ORDER BY cno ASC) c WHERE ROWNUM<=?) WHERE NO>=?");
			psmt.setInt(1, end);
			psmt.setInt(2, start);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Course course = new Course();
				course.setCno(rs.getString("cno"));
				course.setCname(rs.getString("cname"));
				course.setCpno(rs.getString("cpno"));
				course.setCcredit(rs.getDouble("ccredit"));
				course.setPeriod(rs.getInt("period"));
				course.setTheory(rs.getInt("theory"));
				course.setExperiment(rs.getInt("experiment"));
				courses.add(course);
			}
		} catch (SQLException ex) {
			Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			DatabaseBean.close(rs, psmt, conn);
		}
		return courses;
	}

	

}
