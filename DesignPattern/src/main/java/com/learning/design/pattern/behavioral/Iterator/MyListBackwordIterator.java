package com.learning.design.pattern.behavioral.Iterator;

public class MyListBackwordIterator implements Iterator {

	private IMyList list;
	private int i = 0;

	public MyListBackwordIterator(IMyList list) {
		this.list = list;
		i = list.getList().size() - 1;
	}

	@Override
	public Integer getNext() {
		Integer prevVal = list.get(i);
		i--;
		return prevVal;
	}

	@Override
	public boolean hasNext() {
		return i >= 0;
	}

}
