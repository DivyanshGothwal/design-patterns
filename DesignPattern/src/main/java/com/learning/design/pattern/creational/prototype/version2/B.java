package com.learning.design.pattern.creational.prototype.version2;

public class B extends A {


	@Override
	public IPrototype clone(IPrototype prototype) {
		if (prototype == null) {
			B b = new B();
			super.clone(b);
			return b;
		}
		super.clone(prototype);
		return prototype;
	}
}
