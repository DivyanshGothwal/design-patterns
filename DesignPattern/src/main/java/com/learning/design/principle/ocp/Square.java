package com.learning.design.principle.ocp;

public class Square implements Shapes {

	public Integer length = 0;

	public Square(Integer length) {
		this.length = length;
	}

	@Override
	public Integer area() {
		return length * length;
	}
}
