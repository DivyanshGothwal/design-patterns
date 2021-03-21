package com.learning.design.pattern.creational.prototype;

public interface IAircraftBuilder {

	public void buildWing();

	public void buildCockpit();

	public void buildBody();

	public IAircraft getAircraft();
}
