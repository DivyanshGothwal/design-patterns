package com.learning.design.pattern.creational.factory_method;

public class WindowsDialog implements Dialog{

	@Override
	public IButton getButton() {
		return new WindowsButton();
	}

}
