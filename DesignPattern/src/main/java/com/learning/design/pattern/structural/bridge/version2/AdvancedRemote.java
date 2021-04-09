package com.learning.design.pattern.structural.bridge.version2;

public class AdvancedRemote extends NormalRemote {

	public AdvancedRemote(ITv tv) {
		super(tv);
	}

	public void mute() {
		System.out.println("changing volume to zero by advanced remote");
		this.iTv.changeVolume(0);
	}
}
