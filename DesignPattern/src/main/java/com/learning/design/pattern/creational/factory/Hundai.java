package com.learning.design.pattern.creational.factory;

public abstract class Hundai implements Vehicle {
	
	public abstract void changeGearAutomatically();
	
	@Override
	public void start() {
		System.out.println("Start Hundai");
	}

	@Override
	public void stop() {
		System.out.println("Stop Hundai");
	}
}
