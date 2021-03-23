package com.learning.design.pattern.structural.bridge;

public class FlyingCar extends Car {

	public FlyingCar(IEngine engine, ITyre tyre) {
		super(engine, tyre);
	}

	@Override
	public void increaseSpeed() {
		System.out.println("Inccreasing speed of Flying car");
	}
	
	@Override
	public void start() {
		System.out.println("Starting Flying car");
	}
}
