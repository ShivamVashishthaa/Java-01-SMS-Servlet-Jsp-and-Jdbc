package com.sms.servlets;

import java.io.IOException;

import com.sms.dao.StudentDao;
import com.sms.helper.ConnectionProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteById
 */
public class DeleteById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Integer roll = Integer.parseInt(request.getParameter("roll")) ;
		StudentDao studentDao = new StudentDao(ConnectionProvider.getConnection());
		studentDao.deleteById(roll);
		request.getRequestDispatcher("FindAllStudent").forward(request, response);
	}

}
