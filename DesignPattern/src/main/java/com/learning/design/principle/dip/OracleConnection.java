package com.learning.design.principle.dip;

public class OracleConnection implements DbConnection {

	@Override
	public void connect() {
		System.out.println("OracleConnected");
	}

}
