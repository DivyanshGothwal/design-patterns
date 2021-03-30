package com.learning.design.pattern.creational.abstract_factory;

public class Boeing747 extends Aircraft {

	@Override
	public IEngine makeEngine() {
		System.out.println("Boeing747 Engine");
		return new Boeing747Engine();
	}

	@Override
	public ICockpit makeCockpit() {
		System.out.println("Boeing747 Cockpit");
		return new F16Cockpit();
	}

}
