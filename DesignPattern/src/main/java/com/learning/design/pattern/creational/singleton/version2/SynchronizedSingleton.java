package com.learning.design.pattern.creational.singleton.version2;

public class SynchronizedSingleton {
	private static SynchronizedSingleton instance = null;
	private SynchronizedSingleton() {
	}
	
	public static synchronized SynchronizedSingleton getInstance() {
		System.out.println("before "+instance);
		if(instance == null) {
			System.out.println("Inside instance: "+instance);
			instance = new SynchronizedSingleton();
		}
		System.out.println("outside "+instance);
		return instance;
	}
}
