package com.learning.design.pattern.creational.factory_method;

public abstract class Vehicle {

	protected IEngine engine;

	public static Vehicle getInstance(Integer type) {
		switch (type) {
		case 2:
			return new TwoWheelerVehicle();
		case 3:
			return new ThreeWheelerVehicle();
		case 4:
			return new FourWheelerVehicle();
		default:
			return new TwoWheelerVehicle();
		}
	}

	protected abstract void makeVehicle();

	public void ride() {
		makeVehicle();
		System.out.println("Riding Vehicle");
	}
}
