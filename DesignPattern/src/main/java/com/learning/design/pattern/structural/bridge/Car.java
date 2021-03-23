package com.learning.design.pattern.structural.bridge;

public class Car {

	/**
	 * below two variables acts as a bridge between Car and engine
	 */
	IEngine engine;
	
	/**
	 * below two variables acts as a bridge between Car and tyre
	 */
	ITyre tyre;

	public Car(IEngine engine, ITyre tyre) {
		this.engine = engine;
		this.tyre = tyre;
	}

	public void start() {
		System.out.println("Car started");
	}

	public void increaseSpeed() {
		System.out.println("increasing speed");
	}
}
