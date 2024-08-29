package com.sms.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import com.sms.dao.StudentDao;
import com.sms.entity.Student;
import com.sms.helper.ConnectionProvider;

/**
 * Servlet implementation class AddStudent
 */
public class AddStudent extends HttpServlet {
	
       
 	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		Student student = new Student();
 		student.setRoll( Integer.parseInt(request.getParameter("roll")));
 		student.setS_name(request.getParameter("s_name"));
 		student.setS_gender(request.getParameter("s_gender"));
 		student.setS_address(request.getParameter("s_address"));
 		student.setS_course(request.getParameter("s_address"));
 		student.setLocaldate(LocalDate.parse(request.getParameter("localdate")));
 		
 		System.out.println(request.getParameter("localdate"));
 		StudentDao studentDao = new StudentDao(ConnectionProvider.getConnection());
 		studentDao.saveStudent(student);
 		response.sendRedirect("addStudent.jsp");
 	}

}
