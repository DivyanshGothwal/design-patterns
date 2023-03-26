package com.learning.design.pattern.structural.proxy;

/**
 * @author dgothwal
 *
 *	Here we have created a proxy which implements existing interface and overrides
 *  the original methods required by the client and now when client call these methods
 *  it will behave like a proxy i.e it behaves as the original method
 *  (for client perspective nothing is changed) but does some extra processing before 
 *  and after the actual method call.
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
