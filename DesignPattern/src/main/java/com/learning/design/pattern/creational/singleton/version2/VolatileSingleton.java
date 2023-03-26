package com.learning.design.pattern.creational.singleton.version2;

public class VolatileSingleton {
	private static volatile VolatileSingleton instance = null;
	private VolatileSingleton() {
	}
	
	public static VolatileSingleton getInstance() {
		System.out.println("before "+instance);
		if(instance == null) {
			synchronized (VolatileSingleton.class) {
				System.out.println("Inside instance: "+instance);
				instance = new VolatileSingleton();
			}
		}
		System.out.println("outside "+instance);
		return instance;
	}
}
