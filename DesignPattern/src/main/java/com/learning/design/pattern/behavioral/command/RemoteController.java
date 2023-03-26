package com.learning.design.pattern.behavioral.command;

public class RemoteController {

	/**
	 * This means that we have two buttons in our remote and 
	 * we want to load this remote with 2 commands of on and off.
	 */
	private ICommand on;
	private ICommand off;

	public void setCommand(ICommand on, ICommand off) {
		this.on = on;
		this.off = off;
	}

	public void switchOn() {
		this.on.execute();
	}
	public void switchOff() {
		this.off.execute();
	}

}
