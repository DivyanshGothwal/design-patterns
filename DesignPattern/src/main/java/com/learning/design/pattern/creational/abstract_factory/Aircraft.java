package com.learning.design.pattern.creational.abstract_factory;

public abstract class Aircraft {

	public abstract IEngine makeEngine();

	public abstract ICockpit makeCockpit();

	public final void makeAircraft() {
		System.out.println("Started making Engine");
		makeEngine();
		System.out.println("Finished making Engine");
		System.out.println("Started making cockpit");
		makeCockpit();
		System.out.println("Finished making cockpit");
	}

	public static final Aircraft getInstance(Integer type) {
		switch (type) {
		case 1:
			return new F16();
		case 2:
			return new Boeing747();
		default:
			return new F16();
		}
	}

	public void fly() {
		makeAircraft();
		System.out.println("Flying Aircraft");
	}
}
