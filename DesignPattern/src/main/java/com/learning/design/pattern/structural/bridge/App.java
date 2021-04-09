package com.learning.design.pattern.structural.bridge;

/**
 * 
 * Bridge is a structural design pattern that lets you split a large class 
 * or a set of closely related classes into two separate hierarchies—abstraction and 
 * implementation—which can be developed independently of each other.
 * 
 * @author dgothwal
 *
 */
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