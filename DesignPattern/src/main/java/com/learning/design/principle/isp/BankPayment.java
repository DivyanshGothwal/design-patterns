package com.learning.design.principle.isp;

public class BankPayment implements Bank {

	@Override
	public Integer getPaymentInfo() {
		System.out.println("bank payment info");
		return 1;
	}

	@Override
	public Boolean getStatus() {
		System.out.println("getting bank status");
		return true;
	}

	@Override
	public void initiatePayments() {
		System.out.println("initiate bank payment");

	}

}
