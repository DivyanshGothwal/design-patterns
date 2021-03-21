package com.learning.design.pattern.creational.singleton;

public class App {

	public static void main(String ar[]) {
		/**
		 * Singleton is when only one object creation is required. now how to make
		 * singleton class as thread safe
		 * 
		 * using Volatile keyword Problem :- If two threads run on different processors
		 * each thread may have its own local copy of sharedVariable. If one thread
		 * modifies its value the change might not reflect in the original one in the
		 * main memory instantly. This depends on the write policy of cache. Now the
		 * other thread is not aware of the modified value which leads to data
		 * inconsistency.
		 * 
		 * 
		 * 1) Mutual Exclusion: It means that only one thread or process can execute a
		 * 						block of code (critical section) at a time. 
		 * 2) Visibility: It means that changes made by one thread to shared data are 
		 * 				  visible to other threads.
		 * 
		 * Java’s synchronized keyword guarantees both mutual exclusion and visibility.
		 * In some cases we may only desire the visibility and not atomicity. Use of 
		 * synchronized in such situation is an overkill and may cause scalability problems.
		 * Here volatile comes to the rescue. Volatile variables have the visibility 
		 * features of synchronized but not the atomicity features. 
		 * The values of volatile variable will never be cached and all writes and reads 
		 * will be done to and from the main memory.
		 */

		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 30; i++) {
					Singleton s = Singleton.getInstance();
				}
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 30; i++) {
					Singleton s = Singleton.getInstance();
				}
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 500; i++) {
					VolatileSingleton vs = VolatileSingleton.getInstance();
				}
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 500; i++) {
					VolatileSingleton vs = VolatileSingleton.getInstance();
				}
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 500; i++) {
					VolatileSingleton vs = VolatileSingleton.getInstance();
				}
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 500; i++) {
					VolatileSingleton vs = VolatileSingleton.getInstance();
				}
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 500; i++) {
					VolatileSingleton vs = VolatileSingleton.getInstance();
				}
			}
		}.start();

	}
}
