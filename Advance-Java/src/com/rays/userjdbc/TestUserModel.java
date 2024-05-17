package com.rays.userjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestUserModel {

	public static void main(String[] args) throws Exception {

//        testAdd();
//        testFindByPk();
//		testUpdate();
//		  testDelete();
//      testFindByLoginId();
		testSearch();
//		testAuth();
	}

	private static void testFindByLoginId() throws Exception {
		UserModel model = new UserModel();
		String login = "shruti@gmail.com";

		model.findByLoginId(login);
	}

	private static void testAuth() throws Exception {

		UserBean bean = new UserBean();

		UserModel model = new UserModel();

		bean = model.authenticate("niraj@gmail.com", "niraj@123");

		if (bean != null) {

			System.out.println("user login successfully");
			System.out.print(bean.getFirstName());
			System.out.print(" " + bean.getLastName());
			System.out.print(" " + bean.getLoginId());
			System.out.print(" " + bean.getPassword());
			System.out.print(" " + bean.getAddress());

		} else {
			System.out.println("invalid loginId or password");
		}

	}

	private static void testSearch() throws Exception {
		UserBean bean = new UserBean();
		UserModel model = new UserModel();
		List list = new ArrayList(); // Specify the type parameter for list

		list = model.search(bean);
		Iterator<UserBean> it = list.iterator(); // Specify the type parameter for iterator

		while (it.hasNext()) { // Change the loop condition
			bean = it.next(); // Move the iterator to the next element
			System.out.println(bean.getFirstName());
		}
	}

//	private static void testSearch() throws Exception {
//		UserModel model = new UserModel();
//		ResultSet rs = model.search();
//
//		while (rs.next()) {
//			System.out.println(
//					"ID: " + rs.getInt("id") + " First Name: " + rs.getString("firstName") + rs.getString("lastName")
//							+ rs.getString("LoginId") + rs.getString("password") + rs.getString("address"));
//		}
//	}

	private static void testDelete() throws Exception {
		UserModel model = new UserModel();
		int d = 5;
		model.delete(d);

	}

	private static void testUpdate() throws Exception {
		UserModel model = new UserModel();
		int i = 4;
		model.update(i);

	}

	private static void testFindByPk() throws Exception {
		UserBean bean = new UserBean();
		UserModel model = new UserModel();
		bean = model.findByPk(2);

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print(" " + bean.getFirstName());
			System.out.print(" " + bean.getLastName());
			System.out.print(" " + bean.getLoginId());
			System.out.print(" " + bean.getPassword());
			System.out.print(" " + bean.getAddress());
		} else {
			System.out.println("User not found");
		}
	}

	private static void testAdd() throws Exception {
		UserBean bean = new UserBean();
		UserModel model = new UserModel();
		bean.setFirstName("Pratik");
		bean.setLastName("Sharma");
		bean.setLoginId("pratik@gmail.com");
		bean.setPassword("pass123");
		bean.setAddress("Ujjain");
		model.add(bean);
	}
}