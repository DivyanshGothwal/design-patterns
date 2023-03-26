package com.learning.design.pattern.structural.bridge.version2;

public class OnidaTv implements ITv {

	private int volume;
	private int channelId;

	@Override
	public void changeVolume(int amount) {
		volume += amount;
		System.out.println("Volume of Onida tv changed to : " + volume);
	}

	@Override
	public void changeChannel(int channelId) {
		this.channelId = channelId;
		System.out.println("ChannelId of Onida tv changed to : " + this.channelId);
	}

	@Override
	public void start() {
		System.out.println("Starting the Onida tv : ");
	}

	@Override
	public void stop() {
		volume = 0;
		channelId = 0;
		System.out.println("stopping the Onida tv : ");

	}

}
