package com.learning.design.pattern.behavioral.Iterator;

import java.util.List;

public interface IMyList {

	public Iterator getForwardIterator();
	public Iterator getBackwordIterator();
	public void add(Integer ele);
	public Integer get(Integer i);
	public List<Integer> getList();
}
