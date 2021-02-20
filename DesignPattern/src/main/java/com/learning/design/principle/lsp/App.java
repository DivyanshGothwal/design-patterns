package com.learning.design.principle.lsp;

public class App {

	public static void main(String ar[]) {
		// here Duck and ostrish can be replaced without any issue with their respective
		// super/parent type
		Bird d = new Duck();
		d.walk();
		Bird o = new Ostrish();
		o.walk();
	}
}
