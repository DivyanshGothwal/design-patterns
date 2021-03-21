package com.learning.design.pattern.creational.prototype;


public class Boeing747Builder implements IAircraftBuilder {

	Boeing747 boeing = new Boeing747();

	@Override
	public void buildWing() {
		boeing.setWingsBuilded(true);
		System.out.println("f16 building wings");
	}

	@Override
	public void buildCockpit() {
		boeing.setCockpitBuilded(true);
		System.out.println("f16 building cockpit");

	}

	@Override
	public void buildBody() {
		boeing.setBodyBuilded(true);
		System.out.println("f16 building body");
	}

	@Override
	public IAircraft getAircraft() {
		return boeing;
	}

}
