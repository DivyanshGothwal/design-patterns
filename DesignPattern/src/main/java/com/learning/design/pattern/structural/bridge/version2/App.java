package com.learning.design.pattern.structural.bridge.version2;

/**
 * Here we are using bridge pattern
 * 
 * There is a bridge between Remote and TV
 * @author dgothwal
 *
 */
public class App {

	public static void main(String ar[]) {
		ITv tv = new SamsungTv();
		AdvancedRemote ad = new AdvancedRemote(tv);
		ad.mute();

		tv = new SamsungTv();
		NormalRemote nr = new NormalRemote(tv);
		nr.changeVolume();
	}
}
