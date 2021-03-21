package com.learning.design.pattern.creational.abstract_factory;

public class MacDialog implements Dialog{


	@Override
	public IButton getButton() {
		return new MacButton();
	}

	@Override
	public ICheckbox getCheckbox() {
		return  new MacCheckbox();
	}

}
