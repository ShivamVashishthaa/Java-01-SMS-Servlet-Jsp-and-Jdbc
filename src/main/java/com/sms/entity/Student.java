package com.sms.entity;

import java.sql.*;
import java.time.LocalDate;

public class Student {
	private Integer roll;
	private String s_name;
	private String s_gender;
	private String s_address;
	private String s_course;
	private LocalDate localdate;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Integer getRoll() {
		return roll;
	}


	public void setRoll(Integer roll) {
		this.roll = roll;
	}


	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_gender() {
		return s_gender;
	}

	public void setS_gender(String s_gender) {
		this.s_gender = s_gender;
	}

	public String getS_address() {
		return s_address;
	}

	public void setS_address(String s_address) {
		this.s_address = s_address;
	}

	public String getS_course() {
		return s_course;
	}

	public void setS_course(String s_course) {
		this.s_course = s_course;
	}


	public LocalDate getLocaldate() {
		return localdate;
	}


	public void setLocaldate(LocalDate date) {
		this.localdate = date;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", s_name=" + s_name + ", s_gender=" + s_gender + ", s_address=" + s_address
				+ ", s_course=" + s_course + ", localdate=" + localdate + "]";
	}


}
