package com.learning.design.principle.dip;

public class App {

	public static void main(String[] ar) {
		/**
		 * Below implementation follows DIP as high level module depends on low level
		 * module
		 * 
		 * Here User info module is high level module which depends on MySqlConnection,
		 * a low level module 
		 * and both depends on Abstraction whicch is DBConnection which states this principle.
		 */
		UserInfo u = new UserInfo(new MySqlConnection());
		u.getUserInfo();
	}
}
