package com.learning.design.principle.ocp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AreaCalculator {

	List<Shapes> shapes;

	public AreaCalculator() {
		this.shapes = new ArrayList<>();
	}

	public void addShapes(Shapes shape) {
		this.shapes.add(shape);
	}

	public List<Integer> calculateSum() {
		return this.shapes.stream().map(Shapes::area).collect(Collectors.toList());
	}
}
