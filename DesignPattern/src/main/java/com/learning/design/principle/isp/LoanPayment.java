package com.learning.design.principle.isp;

public class LoanPayment implements Loan{

	@Override
	public Integer getPaymentInfo() {
		System.out.println("loan payment info");
		return 1;
	}

	@Override
	public Boolean getStatus() {
		System.out.println("getting loan status");
		return true;
	}

	@Override
	public void intiateLoanSettlement() {
		System.out.println("initating loan settelment");
	}

	@Override
	public void initiateRePayment() {
		System.out.println("initating loan repayment");
	}

}
