package com.learning.design.pattern.structural.decorator;

public class App {

	/**
	 * 
	 * 
	 * In this decorator pattern we are modifying an object behaviour
	 * at runtime by passing to different decorators.
	 * 
	 * It also has-a relationship to itself so that more and more similar functionalities can be added on top of an object.
	 * 
	 * 
	 * In below example we are decorating BaseNotify object, first with FacebookNotify so that it notifies through FB
	 * 
	 * Then we are decorating with SlackNotify so that it notifies through FacebookNotify and SlackNotify.
	 * 
	 * 
	 */
	public static void main(String[] ar) {
		INotifier notfier = new BaseNotify();
		notfier.notifyUser();
		System.out.println();
		System.out.println();
		
		notfier = new FacebookNotify(notfier);
		notfier.notifyUser();
		System.out.println();
		System.out.println();
		
		notfier = new SlackNotify(notfier);
		notfier.notifyUser();
		System.out.println();
		System.out.println();
		
		notfier = new EmailNotify(notfier);
		notfier.notifyUser();
		
		
	}
}
