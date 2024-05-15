package com.rays.Testbundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestHii {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app_hi", new Locale("greeting"));
		System.out.println("greeting : " + rb.getString("greeting"));

	}

}