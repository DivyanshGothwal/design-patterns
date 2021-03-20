package com.learning.design.pattern.creational.builder;

public interface IAircraftFactory {

	public void buildCockpit();

	public void buildWings();

	public void buildEngine();

	public IAircraft getAircraft();
}
