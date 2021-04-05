package com.learning.design.pattern.creational.prototype.version2;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String ar[]) {
		IPrototype a1 = new A();
		a1.setColor("red");
		IPrototype a2 = new A();
		a2.setColor("blue");
		IPrototype b1 = new B();
		b1.setColor("green");
		IPrototype b2 = new B();
		b2.setColor("yellow");
		IPrototype c = new C();
		c.setColor("pink");
		List<IPrototype> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		list.add(b1);
		list.add(b2);
		list.add(c);
		PrototypeRegistry pr = new PrototypeRegistry(list);
		IPrototype clonedGreen = pr.getByColor("red");
		System.out.println(clonedGreen.getColor());
	}
}
