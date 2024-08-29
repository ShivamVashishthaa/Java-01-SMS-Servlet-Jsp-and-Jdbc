package com.sms.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.filters.AddDefaultCharsetFilter;

import com.sms.entity.Student;
import com.sms.helper.ConnectionProvider;

public class StudentDao {
	Connection conn;

	public StudentDao(Connection conn) {
		this.conn = conn;
	}

	public void saveStudent(Student student) {
		String query = "insert into student (roll, s_name, s_gender, s_address, s_course, localdate) value (?,?,?,?,?,?)";
		try {
			PreparedStatement pstm = conn.prepareStatement(query);

			pstm.setInt(1, student.getRoll());
			pstm.setString(2, student.getS_name());
			pstm.setString(3, student.getS_gender());
			pstm.setString(4, student.getS_address());
			pstm.setString(5, student.getS_course());
			pstm.setObject(6,  student.getLocaldate());

			pstm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Student findStudentById(Integer roll) {
		Student student = new Student();
		try {
			String query = "select * from student where roll ="+roll;
			PreparedStatement pstm = conn.prepareStatement(query);
			ResultSet rs = pstm.executeQuery(query);

			if (rs == null) {
				System.out.println("query not executed");
			} else {
				if (rs.next()) {
					student.setRoll(rs.getInt(1));
					student.setS_name(rs.getString(2));
					student.setS_gender(rs.getString(3));
					student.setS_address(rs.getString(4));
					student.setS_course(rs.getString(5));
					student.setLocaldate(rs.getObject(6,LocalDate.class));
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return student;
	}

	public List<Student> findAllStudent() {
		List<Student> list = new ArrayList<Student>();
		String query = "Select * from Student;";
		conn = ConnectionProvider.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setRoll(rs.getInt(1));
				student.setS_name(rs.getString(2));
				student.setS_gender(rs.getString(3));
				student.setS_address(rs.getString(4));
				student.setS_course(rs.getString(5));
				student.setLocaldate(rs.getObject(6,LocalDate.class));
				list.add(student);
			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public void deleteById(int roll) {
		String query = "delete from student where roll = " + roll + " ;";
		System.out.println(query);
		try {
			PreparedStatement statement = conn.prepareStatement(query);
			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occur during deleting");
		}

	}

	public void updateStudent(Student student) {
		String queryString = "update student set s_name = ?, s_gender = ?, s_address = ?, s_course = ?, localdate = ? where roll = ?;";
		try {
			PreparedStatement statement = conn.prepareStatement(queryString);
			statement.setString(1, student.getS_name());
			statement.setString(2, student.getS_gender());
			statement.setString(3, student.getS_address());
			statement.setString(4, student.getS_course());
			statement.setObject(5,student.getLocaldate());
			statement.setInt(6, student.getRoll());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("exception in update");
			System.out.println(e);
		}
	}

}
