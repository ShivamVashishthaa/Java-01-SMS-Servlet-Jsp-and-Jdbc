package com.sms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import com.sms.dao.StudentDao;
import com.sms.entity.Student;
import com.sms.helper.ConnectionProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parameter = request.getParameter("roll");
		PrintWriter out = response.getWriter();
		out.println(parameter);
		
		
		
		
//		
		
		
		
		
		
		
		
	}

}


