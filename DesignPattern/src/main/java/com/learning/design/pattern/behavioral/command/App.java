package com.learning.design.pattern.behavioral.command;

public class App {

	/**
	 * Here 
	 * 
	 * RemoteController is invoker
	 * 
	 * Light and Stereo are receivers
	 * 
	 * LightOffCommand, LightOnCommand, StereoOnCommand, StereoOffCommand
	 * are Commands, which are encapsulating a functionality which is why 
	 * it comes under behaviour pattern
	 * 
	 * 
	 */
	
	public static void main(String[] ar) {
		RemoteController rc = new RemoteController();
		Light light = new Light();
		Stereo stereo = new Stereo();

		rc.setCommand(new LightOffCommand(light));
		rc.switchOn();

		rc.setCommand(new LightOnCommand(light));
		rc.switchOn();

		rc.setCommand(new StereoOnCommand(stereo));
		rc.switchOn();

		rc.setCommand(new StereoOffCommand(stereo));
		rc.switchOn();

	}
}
