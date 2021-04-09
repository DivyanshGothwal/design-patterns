package com.learning.design.pattern.creational.singleton;

/**
 * Not thread safe
 * @author dgothwal
 *
 */
public class Singleton {
	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			System.out.println("New Singleton  in non ");
			instance = new Singleton();
		}
		return instance;
	}

	public void getName() {
		System.out.println("Singleton");
	}
}
