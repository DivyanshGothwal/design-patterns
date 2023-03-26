package com.learning.design.pattern.creational.prototype.version2;

import java.util.List;
import java.util.Optional;

public class PrototypeRegistry {

	private List<IPrototype> prototype;

	public PrototypeRegistry(List<IPrototype> prototype) {
		this.prototype = prototype;
	}

	public IPrototype getByColor(String color) {
		Optional<IPrototype> proto = prototype.stream().filter(e -> color.equals(e.getColor())).findAny();
		if (proto.isPresent()) {
			return proto.get().clone(null);
		}
		return null;
	}
}
