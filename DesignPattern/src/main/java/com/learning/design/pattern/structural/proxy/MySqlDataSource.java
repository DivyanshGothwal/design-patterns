package com.learning.design.pattern.structural.proxy;

public class MySqlDataSource implements DataSource {

	@Override
	public void query() {
		System.out.println("MySql query");
	}

	@Override
	public void save() {
		System.out.println("MySql save");
	}
}
