package com.learning.design.pattern.structural.decorator;

public class Notifier implements INotifier {

	public void notifyUser() {
		System.out.println("Notifying user through email");
	}
}