package com.learning.design.pattern.creational.builder;

public class Boeing747 implements IAircraft {
	@Override
	public void getMaxSpeed() {
		System.out.println("Max speed is 800Miles/hr");
	}
}
