package com.learning.design.pattern.creational.builder;

public class App {

	public static void main(String ar[]) {
		/*
		 * 
		 * This design pattern is mainly focused on abstracting the process of object
		 * creation i.e How the Object is created that is being abstracted. whereas in
		 * factory pattern it is mainly which object to create is being abstracted.
		 * 
		 */
		/**
		 *
		 * Builder Pattern example 
		 * Why Builder Pattern? 
		 * Basically Builder pattern is
		 * used to hide the object creation of the class from external entity.
		 *
		 * This application contains the example 
		 * 			AirCraft
		 * 			  / \ 
		 * 			 /   \
		 * 			/	  \
		 * 	    AirCraft  F16 Boeing747
		 * 
		 * 	AirCraftBuilder :- 	responsible to give empty definition of the common method
		 * 						which will used into the builder 
		 * 		/ 		\ 
		 * F16Builder Boeing747Builder
		 *
		 * AirCraftDirector :- which uses AirCraftBuilder as constructor,according to
		 * requested builder object creation functionality will invoked by the passed
		 * builder.
		 *
		 *
		 * App.java is the main application of this pattern.
		 */
		AbstractAircraftFactory af = new F16Builder();
		Director d = new Director(af);
		d.construct(true);
		IAircraft arft = af.getAircraft();
		arft.getMaxSpeed();
	}

}
