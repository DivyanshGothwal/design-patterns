package com.learning.design.pattern.structural.decorator;

public class App {

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
