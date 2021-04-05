package com.learning.design.pattern.creational.builder.version2;

public class Boeing747Builder implements IAircraftBuilder {

	private Boeing747 boeing;

	public Boeing747Builder() {
		boeing = new Boeing747();
	}

	@Override
	public void buildEngine() {
		boeing.setCockpit(true);
	}

	@Override
	public void buildCockpit() {
		boeing.setEngine(true);
	}

	@Override
	public void buildPassangers() {
		boeing.setPasssenger(true);
	}

	@Override
	public IAircraft getInstance() {
		return boeing;
	}

}
