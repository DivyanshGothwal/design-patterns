package com.learning.design.pattern.creational.factory_method;

public class App {

	public static void main(String[] args) {
		
		Dialog d1 = ButtonFactory.getDialog(1);
		IButton b1 = d1.getButton();
		b1.onClick();
		
		Dialog d2 = ButtonFactory.getDialog(2);
		IButton b2 = d2.getButton();
		b2.onClick();
	}
}
