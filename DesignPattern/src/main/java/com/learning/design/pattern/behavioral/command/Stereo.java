package com.learning.design.pattern.behavioral.command;

public class Stereo {

	private boolean isStereoOn = false;
	private boolean isCdOpen = false;

	public void on() {
		if (!isStereoOn) {
			System.out.println("Stero is off so switching it on");
			isStereoOn = false;
		}
		System.out.println("Stero is switched on");
	}

	public void off() {
		if (isStereoOn) {
			System.out.println("Stero is on so switching it off");
			isStereoOn = false;
		}
		System.out.println("Stero is switched off");
	}

	public void closeCd() {
		if (isCdOpen) {
			System.out.println("Cd is switched on so closing it");
			isCdOpen = true;
		}
		System.out.println("cd is closed");
	}
}
