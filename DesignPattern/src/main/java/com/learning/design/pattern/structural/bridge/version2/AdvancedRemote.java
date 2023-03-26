package com.learning.design.pattern.structural.bridge.version2;

public class AdvancedRemote implements IRemote {

	@Override
	public void changeVolume(int amount) {
		System.out.println("Volume of tv by Advanced remote to : " + amount);
	}

	@Override
	public void start() {
		System.out.println("starting the tv by advanced remote: ");
		
	}

	@Override
	public void stop() {
		System.out.println("stopping the tv by advanced remote: ");
		
	}

	@Override
	public void changeChannel(int channelId) {
		System.out.println("ChannelId of samsung tv changed to : " + channelId);
	}
}
