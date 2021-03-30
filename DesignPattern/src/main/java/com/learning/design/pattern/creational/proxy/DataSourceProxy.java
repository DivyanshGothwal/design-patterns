package com.learning.design.pattern.creational.proxy;

public class DataSourceProxy implements DataSource {

	DataSource dataSource;

	public DataSourceProxy(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void query() {
		System.out.println("Logging before query");
		dataSource.query();
		System.out.println("After");
	}

	@Override
	public void save() {
		System.out.println("Logging before save");
		dataSource.save();
		System.out.println("After");
	}

}
