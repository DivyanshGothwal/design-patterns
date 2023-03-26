package com.learning.design.pattern.creational.factory_method;

public class App {

	public static void main(String[] args) {
		
		Vehicle v = Vehicle.getInstance(4);
		v.ride();
		
	}
}
