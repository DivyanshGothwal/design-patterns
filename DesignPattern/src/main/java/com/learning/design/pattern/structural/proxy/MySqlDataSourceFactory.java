package com.learning.design.pattern.structural.proxy;

public class MySqlDataSourceFactory implements DataSourceFactory {

	@Override
	public DataSource createDataSource() {
		return new DataSourceProxy(new MySqlDataSource());
	}

}
