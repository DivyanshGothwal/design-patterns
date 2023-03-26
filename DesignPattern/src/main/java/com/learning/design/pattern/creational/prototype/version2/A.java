package com.learning.design.pattern.creational.prototype.version2;

public class A implements IPrototype {

	private String color;
	private boolean privateVal;

	@Override
	public IPrototype clone(IPrototype prototype) {
		if (prototype == null) {
			A a = new A();
			a.privateVal = true;
			a.setColor(this.color);
			return a;
		}
		A a = (A) prototype;
		a.privateVal = true;
		prototype.setColor(this.color);
		return prototype;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

}
