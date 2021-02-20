package com.learning.design.principle.lsp;

public class Duck implements FlyingBird{

	@Override
	public void fly() {
		System.out.println("Duck Flying");
	}

	@Override
	public void walk() {
		System.out.println("Duck Walking");
	}

}
