package com.learning.design.pattern.behavioral.template_method;

public class PdfReader extends Reader {

	@Override
	public void read() {
		System.out.println("reading data from pdf");
	}

}
