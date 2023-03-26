package com.learning.design.pattern.structural.bridge.version2;

/**
 * Here we are using bridge pattern
 * 
 * instead of having Advanced samsung remote and normal samsung remote
 * onita advanced remote and onida normal remote
 * 
 * we can split remote and TV class and have a has-a relationship between tv and remote i.e Samsung tv has a remote.
 * 
 * There is a bridge(has-a relationship) between Remote and TV i.e two different interfaces
 * @author dgothwal
 *
 */
public class App {

	public static void main(String ar[]) {
		ITv tv = new SamsungTv(new AdvancedRemote());
		tv.changeVolume(10);

		tv = new SamsungTv(new NormalRemote());
		tv.changeVolume(10);
	}
}
