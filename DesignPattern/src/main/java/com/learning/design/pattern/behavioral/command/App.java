package com.learning.design.pattern.behavioral.command;

public class App {

	/**
	 * 
	 * command pattern is very similar to lambdas in java 8 where we pass a command 
	 * in function parameter that will get executed inside called function.
	 * 
	 * reference :- https://stackoverflow.com/questions/18036760/how-could-the-command-pattern-be-replaced-by-lambda-expressions
	 * 
	 * Here 
	 * 
	 * RemoteController is invoker
	 * 
	 * Light and Stereo are receivers
	 * 
	 * invoker invokes the command and that command performs some action on receiver
	 * 
	 * Instead of hard coding the remote with Lights or stereo which means two 
	 * implementation of remote is required to make thing more complex we have advanced remote
	 * which supports change light colour also then that advanced remote also need to have subclasses
	 * that implement all light behaviour as well as colour behaviour.
	 * This approach can have code duplication and and result into code rot.
	 * so instead of creating these duplicate subclasses create commands and let those 
	 * commands execute or act on receiver.
	 * 
	 * Commands acts as a convenient middle layer that reduces coupling between the 
	 * Invoker and Receiver layers. And that’s only a fraction of the benefits that 
	 * the Command pattern can offer.
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

		rc.setCommand(new LightOffCommand(light), new LightOffCommand(light));
		rc.switchOn();

		rc.setCommand(new StereoOnCommand(stereo), new StereoOffCommand(stereo));
		rc.switchOn();

	}
}
