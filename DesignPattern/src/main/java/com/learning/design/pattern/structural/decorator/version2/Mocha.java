package com.learning.design.pattern.structural.decorator.version2;

public class Mocha extends AddoOnDecorator {

	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public Integer cost() {
		if (beverage != null) {
			return this.beverage.cost() + 2;
		}
		return 2;
	}

}
