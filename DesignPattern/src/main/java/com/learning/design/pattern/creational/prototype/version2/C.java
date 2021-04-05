package com.learning.design.pattern.creational.prototype.version2;

public class C implements IPrototype {
	private String color;


	@Override
	public IPrototype clone(IPrototype prototype) {
		if (prototype == null) {
			IPrototype c = new C();
			c.setColor(this.color);
			return c;
		}
		prototype.setColor(color);
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
