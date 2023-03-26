package com.learning.design.pattern.structural.bridge.version2;

public class NormalRemote implements IRemote {

	@Override
	public void changeVolume(int amount) {
		System.out.println("Volume of tv by Normal remote to : " + amount);
	}

	@Override
	public void start() {
		System.out.println("starting the tv by Normal remote: ");
		
	}

	@Override
	public void stop() {
		System.out.println("stopping the tv by Normal remote: ");
		
	}

	@Override
	public void changeChannel(int channelId) {
		System.out.println("ChannelId of samsung tv changed to : " + channelId);
	}

}
