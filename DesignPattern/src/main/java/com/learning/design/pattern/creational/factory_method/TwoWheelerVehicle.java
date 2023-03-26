package com.learning.design.pattern.creational.factory_method;

public class TwoWheelerVehicle extends Vehicle {

	@Override
	protected void makeVehicle() {
		this.engine = new TwoWheelerEngine();
		System.out.println("Setting two wheeler engine");
	}

}
