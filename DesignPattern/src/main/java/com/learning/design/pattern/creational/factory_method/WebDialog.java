package com.learning.design.pattern.creational.factory_method;

public class WebDialog implements Dialog {

	@Override
	public IButton getButton() {
		return new WebButton();
	}

}
