package com.learning.design.pattern.creational.builder.version2;

public class AircraftDirector {

	private IAircraftBuilder aircraft;

	public AircraftDirector(IAircraftBuilder aircraft) {
		this.aircraft = aircraft;
	}

	public void makeAircraft(Boolean isPassanger) {
		aircraft.buildCockpit();
		aircraft.buildEngine();
		if (Boolean.TRUE.equals(isPassanger)) {
			aircraft.buildPassangers();
		}
	}
}
