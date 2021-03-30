package com.learning.design.principle.dip;

public class App {

	public static void main(String[] ar) {
		/**
		 * Below implementation follows DIP as high level module depends on low level
		 * module
		 * 
		 * Here User info module is high level module which depends on MySqlConnection,
		 * a low level module, both depends on Abstraction which is DBConnection
		 * which states this principle.
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


/*


class A depends class b

b.test();


class a depends on interface c

//class b also depends interface c
class d also depends interface c



*/