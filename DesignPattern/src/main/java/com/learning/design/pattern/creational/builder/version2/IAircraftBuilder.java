package com.learning.design.pattern.creational.builder.version2;

public interface IAircraftBuilder {

	public void buildEngine();
	public void buildCockpit();
	public void buildPassangers();
	public IAircraft getInstance();
}
