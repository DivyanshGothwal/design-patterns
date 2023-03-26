package com.learning.design.pattern.creational.singleton;

/**
 * Full thread safe and not before hand initialization but performance hit
 * 
 * @author dgothwal
 *
 */
public class SynchronizedSingleton {

	private static SynchronizedSingleton instance = new SynchronizedSingleton();

	private SynchronizedSingleton() {
	}

	public static synchronized SynchronizedSingleton getInstance() {
		if (instance == null) {
			instance = new SynchronizedSingleton();
		}
		return instance;
	}
}
