package com.learning.design.pattern.behavioral.command;

public class StereoOnCommand implements ICommand {

	Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.closeCd();
	}

}
