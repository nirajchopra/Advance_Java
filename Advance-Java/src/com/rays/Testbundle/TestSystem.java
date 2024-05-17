package com.rays.Testbundle;

import java.util.ResourceBundle;

public class TestSystem {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.system");
		System.out.println(rb.getString("driver"));
		System.out.println(rb.getString("url"));
		System.out.println(rb.getString("username"));
		System.out.println(rb.getString("password"));

	}

}