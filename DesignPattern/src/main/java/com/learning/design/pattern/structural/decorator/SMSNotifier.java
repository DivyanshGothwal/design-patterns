package com.learning.design.pattern.structural.decorator;

public class SMSNotifier extends BaseDecorator {

	public SMSNotifier(INotifier notifier) {
		super(notifier);
	}

	@Override
	public void notifyUser() {
		super.notifyUser();
		System.out.println("Notifying through SMS");
	}
}
