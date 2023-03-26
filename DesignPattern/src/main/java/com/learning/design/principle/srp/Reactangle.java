package com.learning.design.principle.srp;

public class Reactangle implements Shapes {

	private Integer length;
	private Integer breadth;

	public Reactangle(Integer length, Integer breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public Integer area() {
		return this.length * this.breadth;
	}

}
