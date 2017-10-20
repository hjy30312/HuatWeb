package com.hjy.dao.impl;

import com.hjy.dao.IScDao;
import com.hjy.model.Sc;
import com.hjy.util.MyFactory;
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
 * @author 543363559@qq.com
 * @date 2017年7月14日 上午11:33:11
 */
public class ScDao implements IScDao {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	@Override
    public List<Sc> getAllSc(Pagination pagination) {
		List<Sc> scs = new ArrayList<Sc>();/*
		try {
			conn = DatabaseBean.getConnection();
			psmt = conn.prepareStatement("select count(*) as counts from tb_sc");
			rs = psmt.executeQuery();
			rs.next();
			//求总记录数
            pagination.setCountSize(rs.getInt("counts"));
            int start = (pagination.getPageNo() - 1) * pagination.getPageSize() + 1;//开始位置
            int end = pagination.getPageNo() * pagination.getPageSize();//结束位置
            psmt = conn.prepareStatement("SELECT * FROM (SELECT ROWNUM NO , s.* FROM (SELECT * FROM tb_sc ORDER BY sno ASC) s WHERE ROWNUM<=?) WHERE NO>=?");
            psmt.setInt(1, end);
            psmt.setInt(2, start);
            rs = psmt.executeQuery();
			
			//outer标签跳出循环
			outer:while (rs.next()) {
				//如果学号存在
				for (int i = 0; i < scs.size(); i++) {
					if (rs.getString("sno") == scs.get(i).getSno()) {
						String cno = rs.getString("cno");
						
						String name = MyFactory.getCourseDao().cnoGetCourse(cno).getCname();
						int courseCount = scs.get(i).getCourseCount();
						Double grade = rs.getDouble("grade");
						scs.get(i).getSg().put(cno, grade);
						scs.get(i).getSc().put(cno, name);
						scs.get(i).setCourseCount(courseCount+1);
						continue outer;
					}
				}
				//如果学号不存在
				Sc sc = new Sc();
				sc.setSno(rs.getString("sno"));
				String sno = rs.getString("sno");
				String cno = rs.getString("cno");
				String sname = MyFactory.getStudentDao().getStudent(sno).getSname();
				
				
				String cname = MyFactory.getCourseDao().cnoGetCourse(cno).getCname();
				Double grade = rs.getDouble("grade");

				sc.setName(sname);
				sc.setCourseCount(1);
				sc.getSg().put(cno, grade);
				sc.getSc().put(cno, cname);
				scs.add(sc);
			}
		} catch (SQLException ex) {
			Logger.getLogger(CourseDao.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			DatabaseBean.close(rs, psmt, conn);
		}
		System.out.println(scs);*/
		return scs;
	}

	@Override
    public void getGrade(String sno, String cno) {
		// TODO Auto-generated method stub

	}

	@Override
    public void deleteGrade(String sno, String cno) {
		// TODO Auto-generated method stub

	}

	@Override
    public void updateGrade(String sno, String cno) {
		// TODO Auto-generated method stub

	}

	@Override
    public void getStudentGrade(String sno) {
		// TODO Auto-generated method stub

	}

}
