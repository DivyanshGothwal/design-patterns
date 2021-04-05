package com.learning.design.pattern.creational.proxy;

public class OracleDataSourceFactory implements DataSourceFactory {

	@Override
	public DataSource createDataSource() {
		return new DataSourceProxy(new OracleDataSource());
	}

}
