package com.learning.design.pattern.creational.abstract_factory;

public class F16 extends Aircraft {

	@Override
	public IEngine makeEngine() {
		System.out.println("F16 Engine");
		return new F16Engine();
	}

	@Override
	public ICockpit makeCockpit() {
		System.out.println("F16 Cockpit");
		return new F16Cockpit();
	}

	
}
