package com.learning.design.principle.srp;

public class App {

	public static void main(String ar[]) {
		AreaCalculator area = new AreaCalculator();
		// All types of shapes will inherit Shapes interface 
		// thus making this class open for extension and closed for modification
		area.addShapes(new Circle(12));
		area.addShapes(new Square(19));
		area.addShapes(new Square(8));
		area.addShapes(new Circle(2));
		area.addShapes(new Reactangle(2, 4));

		System.out.println(area.calculateSum());
	}
}
