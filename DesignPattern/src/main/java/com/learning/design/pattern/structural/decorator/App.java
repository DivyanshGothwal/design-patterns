package com.learning.design.pattern.structural.decorator;

public class App {

	/**
	 * 
	 * 
	 * In this decorator pattern we are modifying an object behaviour
	 * at runtime by passing to different decorators
	 * 
	 * @param ar
	 */
	public static void main(String[] ar) {
		INotifier notifier = new Notifier();
		notifier.notifyUser();
		notifier = new FacebookNotifier(notifier);
		notifier.notifyUser();
		notifier = new SMSNotifier(notifier);
		notifier.notifyUser();
		notifier = new SlackNotifier(notifier);
		notifier.notifyUser();
	}
}
