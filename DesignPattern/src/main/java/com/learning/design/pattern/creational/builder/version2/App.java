package com.learning.design.pattern.creational.builder.version2;

public class App {

	public static void main(String a[]) {
		IAircraftBuilder ab = new Boeing747Builder();
		AircraftDirector ad = new AircraftDirector(ab);
		ad.makeAircraft(true);
		IAircraft ac = ab.getInstance();
		System.out.println(ac.getCockpit());
		System.out.println(ac.getEngine());
		System.out.println(ac.getPasssenger());

		System.out.println("=================================");

		ab = new F16AircraftBuilder();
		ad = new AircraftDirector(ab);
		ad.makeAircraft(true);
		ac = ab.getInstance();
		System.out.println(ac.getCockpit());
		System.out.println(ac.getEngine());
		System.out.println(ac.getPasssenger());
	}
}
