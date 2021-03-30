package com.learning.design.pattern.creational.factory_method;

public class ThreeWheelerVehicle extends Vehicle {

	@Override
	protected void makeVehicle() {
		this.engine = new ThreeWheelerEngine();
		System.out.println("Setting three wheeler engine");
	}

}
