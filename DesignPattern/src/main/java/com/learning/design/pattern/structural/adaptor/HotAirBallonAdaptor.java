package com.learning.design.pattern.structural.adaptor;

public class HotAirBallonAdaptor implements IAircraft {

	private HotAirBalloon balloon;

	public HotAirBallonAdaptor(HotAirBalloon balloon) {
		this.balloon = balloon;
	}

	@Override
	public void fly() {
		balloon.fly(balloon.gasUsed());
	}
}
