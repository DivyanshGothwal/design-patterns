package com.learning.design.principle.ocp;

public class App {

	public static void main(String[] args) {
		AreaCalculator area = new AreaCalculator();
		// All types of shapes will inherit Shapes interface 
		// thus making this class open for extension and closed for modification
		area.addShapes(new Circle(12));
		area.addShapes(new Square(19));
		area.addShapes(new Square(8));
		area.addShapes(new Circle(2));
		area.addShapes(new Reactangle(2, 4));

		AreaSumCalculator areaSum = new AreaSumCalculator(area);

		System.out.println(areaSum.getSumAsHtml());
		System.out.println(areaSum.getSumAsJson());
	}

}
