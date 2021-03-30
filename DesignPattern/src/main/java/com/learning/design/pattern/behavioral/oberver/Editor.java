package com.learning.design.pattern.behavioral.oberver;

public class Editor {
	EventPublisher eventObserver;

	Editor(EventPublisher eventObserver) {
		this.eventObserver = eventObserver;
	}

	Boolean isValueAvailable;

	public Boolean getIsValueAvailable() {
		return isValueAvailable;
	}

	public void setIsValueAvailable(Boolean isValueAvailable) {
		this.isValueAvailable = isValueAvailable;
		eventObserver.update();
	}

}
