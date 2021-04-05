package com.learning.design.pattern.behavioral.template_method;

public class App {

	public static void main(String a[]) {
		Order r = new OnlineOrder(true);
		r.processOrder();
		
		r = new StoreOrder(false);
		r.processOrder();
	}
}
