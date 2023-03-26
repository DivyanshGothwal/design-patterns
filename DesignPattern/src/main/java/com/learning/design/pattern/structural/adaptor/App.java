package com.learning.design.pattern.structural.adaptor;


/**
 * @author dgothwal
 * 
 * Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate
 * with each other
 * 
 * Adapters can not only convert data into various formats 
 * but can also help objects with different interfaces collaborate. 
 * 
 * Here’s how it works:
 * 
 * 1) The adapter gets an interface, compatible with one of the existing objects. 
 * 2) Using this interface, the existing object can safely call the adapter’s methods.
 * 3) Upon receiving a call, the adapter passes the request to the second object, 
 * 		but in a format and order that the second object expects.
 * 
 * In the below example HotAirBalloon class has fly method which in not compatible 
 * with current interface. 
 * 
 * To make it compatible with the existing interface we have introduced an adaptor called "HotAirBallonAdaptor"
 * which is implementing current interface and also calls the appropriate fly method of HotAirBalloon class in the
 * way it expects thus making it compatible with existing interface.
 * 
 * 
 *
 */
public class App {
	public static void main(String ar[]) {
		IAircraft air = new HotAirBallonAdaptor(new HotAirBalloon());
		air.fly();
		String s = new String("test").intern();

		String s1 = "test";
		System.out.println(s==s1);
	}
}
