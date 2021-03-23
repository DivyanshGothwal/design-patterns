package com.learning.design.pattern.structural.adaptor;

public class HotAirBalloon {
	String gas = "Helium";

	public String gasUsed() {
		return gas;
	}

	public void fly(String air) {
		System.out.println("Hot air balloon flying with gas " + air);
	}

}
