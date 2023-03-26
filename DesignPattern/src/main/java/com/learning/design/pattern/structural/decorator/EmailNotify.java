package com.learning.design.pattern.structural.decorator;

public class EmailNotify extends NotifyDecorator {

	public EmailNotify(INotifier notifier) {
		super(notifier);
	}
	
	@Override
	public void notifyUser() {
		System.out.println("Notifying through Email");
		super.notifyUser();
	}
}
