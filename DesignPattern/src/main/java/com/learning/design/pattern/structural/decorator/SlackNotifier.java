package com.learning.design.pattern.structural.decorator;

public class SlackNotifier extends BaseDecorator {

	public SlackNotifier(INotifier notifier) {
		super(notifier);
	}

	@Override
	public void notifyUser() {
		super.notifyUser();
		System.out.println("Notifying through Slack");
	}
}
