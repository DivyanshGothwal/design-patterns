package com.learning.design.pattern.structural.decorator;

public abstract class NotifyDecorator implements INotifier {

	private INotifier notifier;
	
	public NotifyDecorator(INotifier notifier) {
		this.notifier  = notifier;
	}
	
	@Override
	public void notifyUser() {
		if(this.notifier != null) {
			notifier.notifyUser();
		}
	}
}
