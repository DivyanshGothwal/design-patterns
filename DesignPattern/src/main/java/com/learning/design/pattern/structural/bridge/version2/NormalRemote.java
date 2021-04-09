package com.learning.design.pattern.structural.bridge.version2;

public class NormalRemote implements IRemote {

	protected ITv iTv;

	public NormalRemote(ITv tv) {
		this.iTv = tv;
	}

	@Override
	public void changeVolume() {
		iTv.changeVolume(1);
	}

	@Override
	public void start() {
		iTv.start();
	}

	@Override
	public void stop() {
		iTv.stop();
	}

	@Override
	public void changeChannel(int channelId) {
		this.iTv.changeChannel(channelId);
	}

}
