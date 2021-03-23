package com.learning.design.pattern.structural.decorator;

public class FacebookNotifier extends BaseDecorator {

	public FacebookNotifier(INotifier notifier) {
		super(notifier);
	}

	@Override
	public void notifyUser() {
		super.notifyUser();
		System.out.println("Notifying through Facebook");
	}
}
