package com.learning.design.pattern.behavioral.template_method;

public class StoreOrder extends Order {

	public StoreOrder(Boolean isGift) {
		this.isGift = isGift;
	}

	@Override
	public void doSelectOrder() {
		System.out.println("Select store Order");
	}

	@Override
	public void doWrapOrder() {
		System.out.println("do wrap of store Order");
	}

	@Override
	public void doPayment() {
		System.out.println("do payment of store Order");
	}

	@Override
	public void doDelivery() {
		System.out.println("do delivery store Order");
	}
}
