package com.learning.design.pattern.creational.abstract_factory;

public class App {

	public static void main(String[] args) {
		Aircraft a = Aircraft.getInstance(1);
		a.fly();
		
		a = Aircraft.getInstance(2);
		a.fly();
	}

}
