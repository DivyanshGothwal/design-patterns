package com.learning.design.pattern.creational.proxy;

/**
 * @author dgothwal
 *
 *	Here we have created a proxy which implements existing interface and overrides
 *  the original methods required by the client and now when client call these methods
 *  it will behave like a proxy which behaves as the original method but do some processing
 *  before and after the actual method call
 *  
 */
public class App {

	public static void main(String ar[]) {
		DataSourceFactory dsf = new OracleDataSourceFactory();
		DataSource ds = dsf.createDataSource();
		ds.query();
		ds.save();
	}
}
