package com.hjy.dao.impl;

import com.hjy.dao.IStudentDao;
import com.hjy.model.Course;
import com.hjy.model.Student;
import com.hjy.util.DatabaseBean;
import com.hjy.util.Pagination;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 数据访问对象
 *
 * @author Administrator
 */
public class StudentDao implements IStudentDao {

    Connection conn = null;
    PreparedStatement psmt = null;
    ResultSet rs = null;


    public List<Student> getAllStudent() {
    	System.out.println(123);
        List<Student> students = new ArrayList<Student>();
        try {
            conn = DatabaseBean.getConnection();
            psmt = conn.prepareStatement("select * from tb_student");
            rs = psmt.executeQuery();
            while (rs.next()) {
                Student stu = new Student();
                stu.setSno(rs.getString("sno"));
                String sno = rs.getString("sno");
                System.out.println(sno);
                stu.setSname(rs.getString("sname"));
                stu.setSsex(rs.getString("ssex"));
                stu.setSage(rs.getInt("sage"));
                stu.setSdept(rs.getString("sdept"));
                students.add(stu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    @Override
    public Student getStudent(String sno) {
        Student stu = null;
        try {
            conn = DatabaseBean.getConnection();
            psmt = conn.prepareStatement("select * from tb_student where sno=?");
            psmt.setString(1, sno);
            rs = psmt.executeQuery(); //用于获取单个结果集（ResultSet）
            if (rs.next()) {
                stu = new Student();
                stu.setSno(rs.getString("sno"));
                stu.setSname(rs.getString("sname"));
                stu.setPassword(rs.getString("password"));
                stu.setSsex(rs.getString("ssex"));
                stu.setSage(rs.getInt("sage"));
                stu.setSdept(rs.getString("sdept"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return stu;
    }

    @Override
    public void insertStudent(Student stu) {
        try {
            conn = DatabaseBean.getConnection();
            psmt = conn.prepareStatement("insert into tb_student values(?,?,?,?,?,?,?,?)");
            psmt.setString(1, stu.getSno());
            psmt.setString(2, stu.getSname());
            psmt.setString(3, stu.getPassword());
            psmt.setString(4, stu.getSsex());
            psmt.setInt(5, stu.getSage());
            psmt.setString(6, stu.getSdept());
            psmt.setDouble(7, stu.getSavggrade());
            psmt.setString(8, stu.getPhoto_url());
            psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteStudent(String sno) {
        try {
            conn = DatabaseBean.getConnection();
            psmt = conn.prepareStatement("delete from tb_student where sno=?");
            psmt.setString(1, sno);
            psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
    }

    @Override
    public void updateStudent(Student stu) {
        try {
            conn = DatabaseBean.getConnection();
            psmt = conn.prepareStatement("update tb_student set sname=?,password=?,ssex=?,sage=?,sdept=? where sno=? ");
            psmt.setString(1, stu.getSname());
            psmt.setString(2,stu.getPassword());
            psmt.setString(3, stu.getSsex());
            psmt.setInt(4, stu.getSage());
            psmt.setString(5, stu.getSdept());
            psmt.setString(6, stu.getSno());
            psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
    }


    @Override
    public List<Student> getAllStudent(Pagination pagination) {
        List<Student> students = new ArrayList<Student>();
        try {
            conn = DatabaseBean.getConnection();
            psmt = conn.prepareStatement("select count(*) as counts from tb_student");
            rs = psmt.executeQuery();
            rs.next();
            //求总记录数
            pagination.setCountSize(rs.getInt("counts"));
            int start = (pagination.getPageNo() - 1) * pagination.getPageSize() + 1;//开始位置
            int end = pagination.getPageNo() * pagination.getPageSize();//结束位置
            psmt = conn.prepareStatement("SELECT * FROM (SELECT ROWNUM NO , s.* FROM (SELECT * FROM tb_student ORDER BY sno ASC) s WHERE ROWNUM<=?) WHERE NO>=?");
            psmt.setInt(1, end);
            psmt.setInt(2, start);
            rs = psmt.executeQuery();
            while (rs.next()) {
                Student stu = new Student();
                stu.setSno(rs.getString("sno"));
                stu.setSname(rs.getString("sname"));
                stu.setSsex(rs.getString("ssex"));
                stu.setSage(rs.getInt("sage"));
                stu.setSdept(rs.getString("sdept"));
                students.add(stu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        return students;
    }

    @Override
    public Map<Course,Double> getStudentCourse(String sno) {
        Map<Course,Double> stuCourse = new HashMap<Course, Double>();
        int count = 0;
        try {
            conn = DatabaseBean.getConnection();
            String sql = "select c.cno,c.cname,c.cpno,c.ccredit,c.period,c.theory,c.experiment,sc.grade " +
                        "from tb_sc sc,tb_course c " +
                        "where  sc.cno = c.cno and sno=?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, sno);
            rs = psmt.executeQuery();
            while (rs.next()) {
                Course course = new Course();
                course.setCno(rs.getString("cno"));
                course.setCname(rs.getString("cname"));
                course.setCpno(rs.getString("cpno"));
                course.setCcredit(rs.getDouble("ccredit"));
                course.setPeriod(rs.getInt("period"));
                course.setExperiment(rs.getInt("experiment"));
                stuCourse.put(course,rs.getDouble("grade"));
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DatabaseBean.close(rs, psmt, conn);
        }
        System.out.println("count:" + count);
        return stuCourse;
    }
}
