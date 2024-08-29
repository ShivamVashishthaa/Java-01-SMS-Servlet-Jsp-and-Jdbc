package com.sms.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	private static final String urlString = "jdbc:mysql://localhost:3306/studentmanagementsystem";
	private static final String username = "root";
	private static final String passward = "root";
	private static Connection conn = null;
	private ConnectionProvider() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() {
		try {
//			System.out.println("try");
			Class.forName("com.mysql.cj.jdbc.Driver");
			if (conn == null ) {
//				System.out.println("if");
				conn = DriverManager.getConnection(urlString,username,passward);
			}
			else {
//				System.out.println("else");
				return conn;
			}
		} catch (Exception e) {
			System.out.println("Connection Not created");
			System.out.println(e);
		}
		return conn;
	}
	
}
