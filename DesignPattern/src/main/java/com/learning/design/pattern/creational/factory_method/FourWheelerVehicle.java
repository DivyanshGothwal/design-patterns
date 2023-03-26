package com.learning.design.pattern.creational.factory_method;

public class FourWheelerVehicle extends Vehicle {

	@Override
	protected void makeVehicle() {
		this.engine = new FourWheelerEngine();
		System.out.println("Setting Four wheeler engine");
	}

}
