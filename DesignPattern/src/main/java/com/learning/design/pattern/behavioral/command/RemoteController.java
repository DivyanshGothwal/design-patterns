package com.learning.design.pattern.behavioral.command;

public class RemoteController {

	private ICommand command;

	public void setCommand(ICommand command) {
		this.command = command;
	}

	public void switchOn() {
		this.command.execute();
	}

}
