package com.learning.design.pattern.structural.decorator.version2;

public class WippedMilk extends AddoOnDecorator {

	private Beverage beverage;

	public WippedMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public Integer cost() {
		if (this.beverage != null) {
			return this.beverage.cost() + 1;
		}
		return 1;
	}

}
