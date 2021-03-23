package com.learning.design.pattern.structural.bridge;

public class App {

	public static void main(String ar[]) {
		Car c = new Car(new AdvancedEngine(), new AdvancedTyre());
		c.start();
		c.increaseSpeed();

		Car ac = new AdvancedCar(new AdvancedEngine(), new AdvancedTyre());
		ac.start();
		ac.increaseSpeed();

		Car fc = new FlyingCar(new AdvancedEngine(), new AdvancedTyre());
		fc.start();
		fc.increaseSpeed();
	}

}