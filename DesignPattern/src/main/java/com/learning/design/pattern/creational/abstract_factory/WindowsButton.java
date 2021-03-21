package com.learning.design.pattern.creational.abstract_factory;

public class WindowsButton implements IButton{

	@Override
	public void onClick() {
		System.out.println("Windows button Clicked");		
	}

}
