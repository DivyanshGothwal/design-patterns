package com.learning.design.pattern.creational.factory;

public class VehicleFactory {

	public static Vehicle getInstance(Integer carType) {
		switch (carType) {
		case 1: {
			return new Waganar();
		}
		case 2: {
			return new Estra();
		}
		case 3: {
			return new I20();
		}
		default: {
			return null;
		}
		}
	}
}
