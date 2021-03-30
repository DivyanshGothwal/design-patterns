package com.learning.design.pattern.behavioral.strategy;

public class App {

	public static void main(String []a) {
		IMap map = new MyMap(new CycleStrategy());
		map.findRoute("Jaipur", "Bengalore");

		map = new MyMap(new CarStrategy());
		map.findRoute("Jaipur", "Bengalore");
		

		map = new MyMap(new BusStrategy());
		map.findRoute("Jaipur", "Bengalore");
	}
	
}