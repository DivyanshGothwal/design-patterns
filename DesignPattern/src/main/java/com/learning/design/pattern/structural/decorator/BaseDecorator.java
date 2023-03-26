package com.learning.design.pattern.structural.decorator;

public class BaseDecorator implements INotifier {

	private INotifier notifier;

	public BaseDecorator(INotifier notifier) {
		this.notifier = notifier;
	}

	@Override
	public void notifyUser() {
		if (notifier != null) {
			notifier.notifyUser();
		}
	}

}
