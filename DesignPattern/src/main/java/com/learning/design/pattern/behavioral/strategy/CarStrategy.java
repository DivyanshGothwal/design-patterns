package com.learning.design.pattern.behavioral.strategy;

public class CarStrategy implements IStrategy {

	@Override
	public void findRoute(String a, String b) {
		System.out.println("Finding best Car route from " + a + " to " + b);
	}

}
