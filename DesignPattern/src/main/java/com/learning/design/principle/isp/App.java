package com.learning.design.principle.isp;

public class App {

	public static void main(String ar[]) {
		/**
		 * this design follows interface segregation principle as bank interface has its
		 * own method specific to bank payments and loan interface has its own method
		 * specific to loan payments
		 * 
		 * otherwise both interfaces has to implement all the methods which are not req
		 * by loan and bank interface
		 */

		Bank b = new BankPayment();
		b.getStatus();
		b.initiatePayments();

		Loan l = new LoanPayment();
		l.getStatus();
		l.initiateRePayment();
		l.initiateRePayment();
	}
}
