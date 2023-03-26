package com.learning.design.pattern.structural.decorator;

public class FacebookNotify extends NotifyDecorator {

	public FacebookNotify(INotifier notifier) {
		super(notifier);
	}
	
	@Override
	public void notifyUser() {
		System.out.println("Notifying through Facebook");
		super.notifyUser();
	}
}
