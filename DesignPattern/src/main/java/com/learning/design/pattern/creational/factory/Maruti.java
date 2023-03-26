package com.learning.design.pattern.creational.factory;

public abstract class Maruti implements Vehicle {

	public abstract void DeployAirBags();

	@Override
	public void start() {
		System.out.println("Start Maruti");
	}

	@Override
	public void stop() {
		System.out.println("Stop Maruti");
	}

}
