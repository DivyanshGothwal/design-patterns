package com.learning.design.pattern.creational.prototype.version2;

public interface IPrototype {

	public String getColor();
	public void setColor(String color);
	public IPrototype clone(IPrototype prototype);
}
