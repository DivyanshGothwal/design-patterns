package com.learning.design.pattern.behavioral.oberver;

public class App {

	public static void main(String[] args) {
		EventPublisher eo = new EventPublisher();
		eo.addObserver(new EmailSubscriber());
		Editor editor = new Editor(eo);
		editor.setIsValueAvailable(true);
		eo.addObserver(new SmsSubscriber());
		editor.setIsValueAvailable(false);
	}

}
