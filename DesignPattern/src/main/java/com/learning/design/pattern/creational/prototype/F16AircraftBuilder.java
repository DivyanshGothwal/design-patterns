package com.learning.design.pattern.creational.prototype;

public class F16AircraftBuilder implements IAircraftBuilder {

	F16 f16 = new F16();

	@Override
	public void buildWing() {
		f16.setWingsBuilded(true);
		System.out.println("Boeing747 building wings");
	}

	@Override
	public void buildCockpit() {
		f16.setCockpitBuilded(true);
		System.out.println("Boeing747 building cockpit");

	}

	@Override
	public void buildBody() {
		f16.setBodyBuilded(true);
		System.out.println("Boeing747 building body");
	}

	@Override
	public IAircraft getAircraft() {
		return f16;
	}

}
