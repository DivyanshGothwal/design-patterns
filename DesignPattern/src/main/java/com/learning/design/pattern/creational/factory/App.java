package com.learning.design.pattern.creational.factory;

public class App {

	public static void main(String[] ar) {
		/**
		 * This pattern states that we should create object without exposing the object
		 * creation logic so that level of Abstraction is high
		 * 
		 */
		Vehicle v = VehicleFactory.getInstance(3);
		v.start();
		v.stop();
	}
}
