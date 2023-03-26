package com.learning.design.principle.lsp;

public class App {

	public static void main(String ar[]) {
		/*
		 * 
		 * Laymen term:- No class should be forced to implement any method that it can perform.
		 * 
		 * Technical definition:- Object of parent class should be completely replaceable the object of any child class
		 * 
		 * here Duck and ostrish can be replaced without any issue with their respective
		 * super/parent type
		 * 
		 * Where as if there has been only bird type having fly method then then
		 * ostrtish fly method would have thrown error which violates liskovs
		 * substitution principle
		 * 
		 */

		Bird d = new Duck();
		d.walk();
		Bird o = new Ostrish();
		o.walk();
	}
}
