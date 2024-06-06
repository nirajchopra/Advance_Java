package com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestCRUD {

	public static void main(String[] args) throws Exception {

//		add();
//		update();
//		delete();
//		search();
//		findById();
//		authenticate();

	}

	private static void authenticate() throws Exception {
		String query = "SELECT * FROM jdbc WHERE loginId = 'niraj@gmail.com' AND password = 'niraj@123'";
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcAdvance", "root", "root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		if (rs.next()) {
			System.out.println("Authentication successful.");
		} else {
			System.out.println("Authentication failed.");
		}
	}

	private static void findById() throws Exception {

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcAdvance", "root", "root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from jdbc where id = 2");
		while (rs.next()) {
			System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("firstName"));
		}
	}

	private static void search() throws Exception {
		String query = "SELECT * FROM jdbc";
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcAdvance", "root", "root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from jdbc");
		while (rs.next()) {
			System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("firstName"));
		}
	}

	private static void delete() throws Exception {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcAdvance", "root", "root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("DELETE FROM jdbc WHERE id = 19");
		System.out.println("Data deleted successfully...!!" + i);
	}

	private static void update() throws Exception {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcAdvance", "root", "root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("UPDATE jdbc SET password = 'Shruti@1234' WHERE id = 2");
		System.out.println("Data updated successfully...!!" + i);
	}

	private static void add() throws Exception {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcAdvance", "root", "root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("INSERT INTO jdbc (id, firstname, lastname, loginId, password, address) VALUES "
				+ "(19, 'Anand', 'Choudhary', 'anand@gmail.com', 'anand@123', 'dewas')");
		System.out.println("Data added successfully...!!" + i);

	}
}