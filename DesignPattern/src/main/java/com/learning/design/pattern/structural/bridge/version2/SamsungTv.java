package com.learning.design.pattern.structural.bridge.version2;

public class SamsungTv implements ITv {

	private int volume;
	private int channelId;

	@Override
	public void changeVolume(int amount) {
		volume += amount;
		System.out.println("Volume of samsung tv changed to : " + volume);
	}

	@Override
	public void changeChannel(int channelId) {
		this.channelId = channelId;
		System.out.println("ChannelId of samsung tv changed to : " + this.channelId);
	}

	@Override
	public void start() {
		System.out.println("Starting the samsung tv : ");
	}

	@Override
	public void stop() {
		volume = 0;
		channelId = 0;
		System.out.println("stopping the samsung tv : ");

	}

}
