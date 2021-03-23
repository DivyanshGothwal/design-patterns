package com.learning.design.pattern.structural.adaptor;

public class App {
	public static void main(String ar[]) {
		IAircraft air = new HotAirBallonAdaptor(new HotAirBalloon());
		air.fly();
	}
}
