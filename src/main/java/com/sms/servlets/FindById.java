package com.sms.servlets;

import java.io.IOException;

import com.sms.dao.StudentDao;
import com.sms.entity.Student;
import com.sms.helper.ConnectionProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FindById extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FindById() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		Integer roll = Integer.parseInt(request.getParameter("1"));
		StudentDao dao = new StudentDao(ConnectionProvider.getConnection());
		Student studentById = dao.findStudentById(1);
		System.out.println(studentById);
	}

}
