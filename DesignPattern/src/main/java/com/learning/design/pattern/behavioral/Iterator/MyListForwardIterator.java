package com.learning.design.pattern.behavioral.Iterator;

public class MyListForwardIterator implements Iterator {

	private IMyList list;

	private int i = 0;

	public MyListForwardIterator(IMyList list) {
		this.list = list;
	}

	@Override
	public Integer getNext() {
		Integer nextEle = list.get(i);
		i++;
		return nextEle;
	}

	@Override
	public boolean hasNext() {
		return i < list.getList().size();
	}

}
