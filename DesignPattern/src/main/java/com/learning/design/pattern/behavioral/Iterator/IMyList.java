package com.learning.design.pattern.behavioral.Iterator;

import java.util.List;

public interface IMyList extends IterableList {

	public void add(Integer ele);
	public Integer get(Integer i);
	public List<Integer> getList();
}
