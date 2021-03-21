package com.learning.design.pattern.creational.factory_method;

public class WebButton implements IButton {

	@Override
	public void onClick() {
		System.out.println("Web button clicked");
	}

}
