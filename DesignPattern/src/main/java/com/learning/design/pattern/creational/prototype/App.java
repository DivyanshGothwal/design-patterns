package com.learning.design.pattern.creational.prototype;

public class App {

	/**
	 * If creation of an object is expensive or complex then instead of creating a
	 * new object every time, we can clone the object(deep copy or shallow copy it
	 * depends on the implementation).
	 * 
	 * Example1:- If any new organization started the scooty manufacturing then it
	 * will be started with the basic functionality of the engine or other parts and
	 * add it to the scooty object, later when the improved version of engine is
	 * ready then scooty object can be cloned and then new engine can be set into
	 * the cloned object.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		IAircraftBuilder ab = new Boeing747Builder();
		AircraftDirector d = new AircraftDirector(ab);
		d.create();
		IAircraft air = ab.getAircraft();

		IAircraft air2 = air.clone();
		air2.setBodyBuilded(false);
		System.out.println("air2: " + air2.isBodyBuilded());
		System.out.println("air: " + air.isBodyBuilded());
	}

}
