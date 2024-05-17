package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestConnection {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement stmt = conn.createStatement();
		System.out.println("Connection Successfully");
	}

}