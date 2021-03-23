package com.learning.design.pattern.structural.bridge;

public class AdvancedCar extends Car {

	public AdvancedCar(IEngine engine, ITyre tyre) {
		super(engine, tyre);
	}

	@Override
	public void increaseSpeed() {
		System.out.println("Increasing speed of Advanced car");
	}

	@Override
	public void start() {
		System.out.println("Starting Advanced car");
	}
}
