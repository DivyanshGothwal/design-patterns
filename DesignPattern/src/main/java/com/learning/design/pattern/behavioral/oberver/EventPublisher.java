package com.learning.design.pattern.behavioral.oberver;

import java.util.ArrayList;
import java.util.List;

public class EventPublisher {

	List<ISubscriber> list = null;

	EventPublisher() {
		list = new ArrayList<>();
	}

	public void addObserver(ISubscriber observer) {
		list.add(observer);
	}

	public void removeObserver(ISubscriber observer) {
		list.remove(observer);
	}

	public void update() {
		list.forEach(ISubscriber::update);
	}
}
