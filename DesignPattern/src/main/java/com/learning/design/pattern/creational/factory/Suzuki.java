package com.learning.design.pattern.creational.factory;

public abstract class Suzuki implements Vehicle {
	
	public abstract void openRoofTop();
	
	@Override
	public void start() {
		System.out.println("Start Suziki");
	}

	@Override
	public void stop() {
		System.out.println("Stop Suzuki");
	}
}
