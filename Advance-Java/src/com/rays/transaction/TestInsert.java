package com.rays.transaction;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.rays.util.JDBCDataSource;


public class TestInsert {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		try {
			conn = JDBCDataSource.getConnection();
			Statement stmt = conn.createStatement();
			conn.setAutoCommit(false);
			int i = stmt.executeUpdate(
					"insert into jdbc values(11, 'Avnish', 'Upadhyay', 'avnish@gmail.com', 'avnish@123', 'Indore')");

			i = stmt.executeUpdate(
					"insert into jdbc values(12, 'Anand', 'Choudhary', 'anand@gmail.com', 'anand@123', 'Indore')");

			i = stmt.executeUpdate(
					"insert into jdbc values(13, 'Arushi', 'Patel', 'arushi@gmail.com', 'arushi@123', 'Indore')");

			i = stmt.executeUpdate(
					"insert into jdbc values(11, 'Avnish', 'Upadhyay', 'avnish@gmail.com', 'avnish@123', 'Indore')");
			conn.commit();
			System.out.println("Data insert");
			
		} catch (Exception e) {

			conn.rollback();
			System.out.println("Data not inserted");
			System.out.println(e.getMessage());
		}

	}

}
