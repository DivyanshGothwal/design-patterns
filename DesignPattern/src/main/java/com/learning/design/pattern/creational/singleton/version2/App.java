package com.learning.design.pattern.creational.singleton.version2;

public class App {

	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			Thread singletonThread = new Thread() {
				public void run() {
					Singleton.getInstance();
				}
			};
			singletonThread.start();
		}
		for(int i=0;i<100;i++) {
			Thread singletonThread = new Thread() {
				public void run() {
					SynchronizedSingleton.getInstance();
				}
			};
			singletonThread.start();
		}
		for(int i=0;i<100;i++) {
			Thread singletonThread = new Thread() {
				public void run() {
					VolatileSingleton.getInstance();
				}
			};
			singletonThread.start();
		}
	}

}
