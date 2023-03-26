package com.learning.design.pattern.behavioral.template_method;

public class OnlineOrder extends Order {

	public OnlineOrder(Boolean isGift) {
		this.isGift = isGift;
	}

	@Override
	public void doSelectOrder() {
		System.out.println("Select online Order");
	}

	@Override
	public void doWrapOrder() {
		System.out.println("do wrap of online Order");
	}

	@Override
	public void doPayment() {
		System.out.println("do payment of online Order");
	}

	@Override
	public void doDelivery() {
		System.out.println("do delivery online Order");
	}
}
