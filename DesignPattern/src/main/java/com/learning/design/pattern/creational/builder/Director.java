package com.learning.design.pattern.creational.builder;

public class Director {
	AbstractAircraftFactory aircraftFactory;

	Director(AbstractAircraftFactory aircraftFactory) {
		this.aircraftFactory = aircraftFactory;
	}

	public void construct(Boolean isPassanger) {
		this.aircraftFactory.buildCockpit();
		this.aircraftFactory.buildEngine();
		this.aircraftFactory.buildWings();
		if (isPassanger != null && isPassanger) {
			this.aircraftFactory.buildPassanger();
		}
	}
}
