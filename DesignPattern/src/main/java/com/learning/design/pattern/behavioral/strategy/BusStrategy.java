package com.learning.design.pattern.behavioral.strategy;

public class BusStrategy implements IStrategy {

	@Override
	public void findRoute(String a, String b) {
		System.out.println("Finding best Bus route from " + a + " to " + b);
	}

}
