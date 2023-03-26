package com.learning.design.pattern.structural.decorator.version2;

public class App {

	public static void main(String ar[]) {
		Beverage bev = new ColdCoffie();
		bev = new WippedMilk(bev);
		bev = new Mocha(bev);
		System.out.print(bev.cost());
	}
}
