package com.learning.design.pattern.creational.abstract_factory;

public class DialogFactory {

	public static Dialog getDialog(Integer i) {
		switch (i) {
		case 1: {
			return new WindowDialog();
		}
		case 2: {
			return new MacDialog();
		}
		default: {
			return new WindowDialog();
		}
		}
	}

}
