package com.learning.design.principle.ocp;

public class AreaSumCalculator {

	private AreaCalculator areaCalculator;

	public AreaSumCalculator(AreaCalculator area) {
		this.areaCalculator = area;
	}

	public String getSumAsJson() {
		return this.areaCalculator.calculateSum().toString() + " JSON ";
	}

	public String getSumAsHtml() {
		return this.areaCalculator.calculateSum().toString() + " HTML ";
	}
}
