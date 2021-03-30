package com.learning.design.pattern.behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class MyList implements IMyList {

	private List<Integer> list;

	public MyList() {
		list = new ArrayList<>();
	}

	public MyList(int size) {
		list = new ArrayList<>(size);
	}

	@Override
	public Iterator getForwardIterator() {
		return new MyListForwardIterator(this);
	}

	@Override
	public Iterator getBackwordIterator() {
		return new MyListBackwordIterator(this);
	}

	@Override
	public void add(Integer ele) {
		list.add(ele);
	}

	@Override
	public Integer get(Integer i) {
		return list.get(i);
	}

	@Override
	public List<Integer> getList() {
		return this.list;
	}

}
