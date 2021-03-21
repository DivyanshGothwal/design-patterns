package com.learning.design.pattern.creational.abstract_factory;

public class WindowDialog implements Dialog{

	@Override
	public IButton getButton() {
		return new WindowsButton();
	}

	@Override
	public ICheckbox getCheckbox() {
		return  new WindowsCheckbox();
	}

}
