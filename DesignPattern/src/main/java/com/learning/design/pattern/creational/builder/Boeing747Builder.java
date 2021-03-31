package com.learning.design.pattern.creational.builder;

public class Boeing747Builder extends AbstractAircraftFactory {

	Boeing747 boeing;

	@Override
	public void buildCockpit() {
		System.out.println("building Cockpit");
	}

	@Override
	public void buildWings() {
		System.out.println("building Wings");
	}

	@Override
	public void buildEngine() {
		System.out.println("building Engine");
	}

	@Override
	public void buildPassanger() {
		System.out.println("building Passanger");
	}

	@Override
	public IAircraft getAircraft() {
		if(boeing==null) {
			boeing = new Boeing747();
		}
		return boeing;
	}

}
