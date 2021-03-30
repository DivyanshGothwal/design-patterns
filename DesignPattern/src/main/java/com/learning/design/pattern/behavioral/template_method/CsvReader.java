package com.learning.design.pattern.behavioral.template_method;

public class CsvReader extends Reader {

	@Override
	public void read() {
		System.out.println("Reading data from CSV file");
	}

}
