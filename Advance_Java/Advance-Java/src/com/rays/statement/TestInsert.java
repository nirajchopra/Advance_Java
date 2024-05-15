package com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcAdvance", "root", "root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("insert into jdbc values(10,'Champaklal','Gada','chamaklal@gmail.com','chamaklal@123','mumbai')");

		System.out.println("Data inserted successfully....!!!" + i);
	}

}