package com.learning.design.pattern.behavioral.oberver;

public class EmailSubscriber implements ISubscriber{

	@Override
	public void update() {
		System.out.println("Notifying through Email");
	}

}
