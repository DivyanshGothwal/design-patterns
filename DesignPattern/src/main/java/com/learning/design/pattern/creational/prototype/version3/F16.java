package com.learning.design.pattern.creational.prototype.version3;

import java.util.ArrayList;
import java.util.List;

public class F16 implements Cloneable {
	
	private List<String> actions;
	
	private Float length;
	
	private Float width;
	
	private Float height;
	
	public void loadData() {
		// load data from DB
		actions.add("view");
		actions.add("update");
		actions.add("delete");
		actions.add("create");
	}
	
	F16(List<String> clonedActions){
		this.actions = clonedActions;
	}

	@Override
	public Object clone() {
		List<String> clonedActions = new ArrayList<>();
		actions.stream().forEach((action) -> {
			clonedActions.add(action);
		});
		return new F16(clonedActions);
	}
	
	public List<String> getActions(){
		return this.actions;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Float getWidth() {
		return width;
	}

	public void setWidth(Float width) {
		this.width = width;
	}

	public Float getLength() {
		return length;
	}

	public void setLength(Float length) {
		this.length = length;
	}
}
