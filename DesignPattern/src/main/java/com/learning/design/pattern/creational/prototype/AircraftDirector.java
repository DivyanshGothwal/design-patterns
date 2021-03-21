package com.learning.design.pattern.creational.prototype;

public class AircraftDirector {

	private IAircraftBuilder builder;

	public AircraftDirector(IAircraftBuilder builder) {
		this.builder = builder;
	}

	public void create() {
		builder.buildBody();
		builder.buildCockpit();
		builder.buildWing();
	}

}
