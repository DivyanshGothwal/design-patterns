package com.learning.design.pattern.behavioral.command;

public class Light {

	boolean isLightOn = false;

	public void on() {
		if (!isLightOn) {
			System.out.println("Light is switched off so switching it on");
			isLightOn = true;
		}
		System.out.println("Light is switched on");
	}

	public void off() {
		if (isLightOn) {
			System.out.println("Light is switched on so switching it off");
			isLightOn = false;
		}
		System.out.println("Light is switched off");
	}
}
