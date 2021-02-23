package com.learning.design.principle.dip;

public class UserInfo {
	private DbConnection dbConnection;

	public UserInfo(DbConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	public void getUserInfo() {
		dbConnection.connect();
		System.out.println("Getting user details from DB");
	}
}
