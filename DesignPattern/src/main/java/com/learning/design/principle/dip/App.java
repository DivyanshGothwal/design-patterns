package com.learning.design.principle.dip;

public class App {

	public static void main(String[] ar) {
		/**
		 * 
		 * Both high level module and low level module should not depend on each other
		 * but they should depend on Abstractions.
		 * 
		 * Dependency Inversion is a way to implement dependency injection principle
		 * 
		 * IOC => taking control of object creation is given to external service on
		 * behalf of developer(Spring framework)
		 * 
		 * 
		 * Below implementation follows DIP as high level module depends does not
		 * directly depend on low level module but depend on abstraction
		 * 
		 * Here User info module is high level module which depends on DBConnection
		 * which is abstraction.
		 * 
		 * if this principle is not followed the open close principle will be violated
		 * as if low level module changes high level module also changes thus violating
		 * OCP
		 * 
		 */
		UserInfo u = new UserInfo(new OracleConnection());
		u.getUserInfo();
	}
}