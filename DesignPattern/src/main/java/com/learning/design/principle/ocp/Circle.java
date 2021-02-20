package com.learning.design.principle.ocp;

public class Circle implements Shapes {

	public Integer radius = 0;

	public Circle(Integer radius) {
		this.radius = radius;
	}

	@Override
	public Integer area() {
		return radius * radius * 3;
	}
}
