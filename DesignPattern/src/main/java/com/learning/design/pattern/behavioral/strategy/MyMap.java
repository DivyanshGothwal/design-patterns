package com.learning.design.pattern.behavioral.strategy;

public class MyMap implements IMap{

	private IStrategy strategy;
	
	public MyMap(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	@Override
	public void findRoute(String a, String b) {
		this.strategy.findRoute(a, b);
	}

}
