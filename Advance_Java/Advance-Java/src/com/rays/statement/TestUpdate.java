package com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdate {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");
		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("update marks set name = 'Lucky' where id = 2");
		System.out.println("Date update successfully...!!");
	}

}