package com.learning.design.pattern.creational.singleton.version2;

public class Singleton {
	private static Singleton instance = null;
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		System.out.println("before "+instance);
		if(instance == null) {
			System.out.println("Inside instance: "+instance);
			instance = new Singleton();
		}
		System.out.println("outside "+instance);
		return instance;
	}
}
