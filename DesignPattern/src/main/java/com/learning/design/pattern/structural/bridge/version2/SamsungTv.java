package com.learning.design.pattern.structural.bridge.version2;

public class SamsungTv implements ITv {

	private IRemote remote;

	SamsungTv(IRemote remote) {
		this.remote = remote;
	}

	@Override
	public void changeVolume(int amount) {
		this.remote.changeVolume(amount);
		System.out.println("Volume of samsung tv changed to : " + amount);
	}

	@Override
	public void changeChannel(int channelId) {
		this.remote.changeChannel(channelId); 
		System.out.println("ChannelId of samsung tv changed to : " + channelId);
	}

	@Override
	public void start() {
		System.out.println("Starting the samsung tv : ");
	}

	@Override
	public void stop() {
		this.remote.changeVolume(0);
		this.remote.changeChannel(0); 
		System.out.println("stopping the samsung tv : ");

	}

}
