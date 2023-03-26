package com.learning.design.pattern.structural.decorator;

public class BaseNotify implements INotifier {

	@Override
	public void notifyUser() {
		System.out.println("Base notifier");
	}

}
