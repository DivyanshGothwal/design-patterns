package com.learning.design.pattern.creational.builder.version2;

public class F16AircraftBuilder implements IAircraftBuilder{
	
	private F16 f16;
	
	public F16AircraftBuilder(){
		f16 = new F16();
	}
	
	@Override
	public void buildEngine() {
		f16.setCockpit(true);
	}

	@Override
	public void buildCockpit() {
		f16.setEngine(true);
	}

	@Override
	public void buildPassangers() {
	}

	@Override
	public IAircraft getInstance() {
		return f16;
	}

}
