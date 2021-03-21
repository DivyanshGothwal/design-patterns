package com.learning.design.pattern.creational.factory_method;

public class ButtonFactory {

	public static Dialog getDialog(Integer i) {
		switch (i) {
		case 1: {
			return new WebDialog();
		}
		case 2: {
			return new WindowsDialog();
		}
		default: {
			return new WebDialog();
		}
		}
	}
}
