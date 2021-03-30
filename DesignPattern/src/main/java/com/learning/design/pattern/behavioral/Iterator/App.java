package com.learning.design.pattern.behavioral.Iterator;

public class App {

	public static void main(String ar[]) {
		IMyList list = new MyList();
		list.add(1);
		list.add(12);
		list.add(31);
		list.add(51);
		list.add(13);
		list.add(15);
		list.add(61);
		list.add(11);
		list.add(17);
		
		Iterator itr = list.getBackwordIterator();
		while(itr.hasNext()) {
			System.out.println(itr.getNext());
		}
		
		itr = list.getForwardIterator();
		while(itr.hasNext()) {
			System.out.println(itr.getNext());
		}
	}
}
