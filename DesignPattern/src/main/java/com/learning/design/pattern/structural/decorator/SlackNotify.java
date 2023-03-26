package com.learning.design.pattern.structural.decorator;

public class SlackNotify extends NotifyDecorator {

	public SlackNotify(INotifier notifier) {
		super(notifier);
	}

	@Override
	public void notifyUser() {
		System.out.println("Notifying through Slack");
		super.notifyUser();
	}
}
