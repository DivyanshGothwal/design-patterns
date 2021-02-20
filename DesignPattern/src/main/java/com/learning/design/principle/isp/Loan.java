package com.learning.design.principle.isp;

public interface Loan extends Payment {
	void intiateLoanSettlement();
    void initiateRePayment();
}
