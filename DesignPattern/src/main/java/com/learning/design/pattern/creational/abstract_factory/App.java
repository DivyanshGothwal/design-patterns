package com.learning.design.pattern.creational.abstract_factory;

public class App {

	public static void main(String[] args) {
		Dialog d1 = DialogFactory.getDialog(1);
		IButton b1 = d1.getButton();
		ICheckbox c1 = d1.getCheckbox();
		b1.onClick();
		c1.onClick();

		Dialog d2 = DialogFactory.getDialog(2);
		IButton b2 = d2.getButton();
		ICheckbox c2 = d2.getCheckbox();
		b2.onClick();
		c2.onClick();
	}

}
