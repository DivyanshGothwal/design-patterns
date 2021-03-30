package com.learning.design.pattern.behavioral.strategy;

public class CycleStrategy implements IStrategy {

	@Override
	public void findRoute(String a, String b) {
		System.out.println("Finding best Cycle route from " + a + " to " + b);
	}

}
