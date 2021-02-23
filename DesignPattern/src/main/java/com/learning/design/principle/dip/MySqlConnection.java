package com.learning.design.principle.dip;

public class MySqlConnection implements DbConnection{

	@Override
	public void connect() {
		System.out.println("Connecting to my sql");
	}

}
