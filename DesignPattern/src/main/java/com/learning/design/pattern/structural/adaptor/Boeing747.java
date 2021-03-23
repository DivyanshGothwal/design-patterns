package com.learning.design.pattern.structural.adaptor;

public class Boeing747 implements IAircraft {
	@Override
	public void fly() {
		System.out.println("Boeing 747 flying");
	}
}
