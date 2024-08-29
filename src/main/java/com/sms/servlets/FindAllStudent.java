package com.sms.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

import com.sms.dao.StudentDao;
import com.sms.entity.Student;
import com.sms.helper.ConnectionProvider;

/**
 * Servlet implementation class FinalAllStudent
 */
public class FindAllStudent extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		StudentDao studentDao = new StudentDao(ConnectionProvider.getConnection());
		List<Student> allStudent = studentDao.findAllStudent();
//		allStudent.stream().forEach(System.out::println);
//		PrintWriter writer = response.getWriter();
//		writer.println(allStudent);
//		for (Student student : allStudent) {
//			System.out.println(student);
//		}
		request.setAttribute("allStudent", allStudent);
		request.getRequestDispatcher("/allStudents.jsp").forward(request, response); 
	}

}
