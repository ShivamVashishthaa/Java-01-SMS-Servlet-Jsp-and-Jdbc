package com.sms.servlets;

import java.io.IOException;
import java.time.LocalDate;

import com.sms.dao.StudentDao;
import com.sms.entity.Student;
import com.sms.helper.ConnectionProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		int roll = Integer.parseInt(request.getParameter("roll"));
		StudentDao dao = new StudentDao(ConnectionProvider.getConnection());
		Student studentById = dao.findStudentById(roll);
		request.setAttribute("student", studentById);
		request.getRequestDispatcher("updateStudent.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Student student = new Student();
		student.setS_name(request.getParameter("s_name"));
		student.setRoll(Integer.parseInt(request.getParameter("roll")));
		student.setS_gender(request.getParameter("s_gender"));
		student.setS_address(request.getParameter("s_address"));
		student.setS_course(request.getParameter("s_course"));
		student.setLocaldate(LocalDate.parse(request.getParameter("localdate")));
		updateStudent(student);
		response.sendRedirect("FindAllStudent");
	}
	
	private void updateStudent(Student stu) {
		StudentDao dao = new StudentDao(ConnectionProvider.getConnection());
		dao.updateStudent(stu);
	}

}
