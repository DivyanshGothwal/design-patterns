package com.learning.design.pattern.creational.singleton;

public class VolatileSingleton {

	private static volatile VolatileSingleton instance = null;

	private VolatileSingleton() {

	}

	public static VolatileSingleton getInstance() {
		if (instance == null) {
			synchronized (VolatileSingleton.class) {
				if (instance == null) {
					System.out.println("Printed in volatile ");
					instance = new VolatileSingleton();
				}
			}
		}
		return instance;
	}

	public void getName() {
		System.out.println("Volatile Singleton");
	}
}
