package com.learning.design.pattern.creational.singleton;
/**
 * Full thread safe but before hand initialization
 * @author dgothwal
 *
 */
public class SingletonBeforeHand {

	private static final SingletonBeforeHand INSTANCE = new SingletonBeforeHand();

	private SingletonBeforeHand() {
	}

	public static SingletonBeforeHand getInstance() {
		return INSTANCE;
	}
}
