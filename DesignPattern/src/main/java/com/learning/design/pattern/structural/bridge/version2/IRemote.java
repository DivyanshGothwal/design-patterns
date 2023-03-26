package com.learning.design.pattern.structural.bridge.version2;

public interface IRemote {

	public void changeVolume(int volumne);

	public void start();

	public void stop();

	public void changeChannel(int cchannelId);
}
