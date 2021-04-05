package com.learning.design.pattern.creational.proxy;

public class OracleDataSource implements DataSource {

	@Override
	public void query() {
		System.out.println("Oltp query");
	}

	@Override
	public void save() {
		System.out.println("Oltp save");
	}

}
