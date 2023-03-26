package com.learning.design.pattern.creational.builder;

public class F16Builder extends AbstractAircraftFactory {

	F16 f16;

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
		System.out.println("building engine");
	}

	@Override
	public IAircraft getAircraft() {
		if (f16 == null) {
			f16 = new F16();
		}
		return f16;
	}

}
