package com.learning.design.pattern.creational.proxy;

public class App {

	public static void main(String ar[]) {
		DataSourceFactory dsf = new MySqlDataSourceFactory();
		DataSource ds = dsf.createDataSource();
		ds.query();
		ds.save();
	}
}