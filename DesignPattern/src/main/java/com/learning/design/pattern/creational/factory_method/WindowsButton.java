package com.learning.design.pattern.creational.factory_method;

public class WindowsButton implements IButton{

	@Override
	public void onClick() {
		System.out.println("Windows button clicked");
	}

}
