package com.learning.design.pattern.behavioral.oberver;

public class SmsSubscriber implements ISubscriber {

	@Override
	public void update() {
		System.out.println("Notifying through SMS");
	}
}
