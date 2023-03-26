package com.learning.design.pattern.behavioral.template_method;

public abstract class Order {

	protected boolean isGift;

	public final void processOrder() {
		doSelectOrder();
		if (isGift) {
			doWrapOrder();
		}
		doPayment();
		doDelivery();
	}

	public abstract void doSelectOrder();

	public abstract void doWrapOrder();

	public abstract void doPayment();

	public abstract void doDelivery();

}
