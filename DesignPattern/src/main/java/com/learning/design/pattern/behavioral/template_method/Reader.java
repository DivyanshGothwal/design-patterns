package com.learning.design.pattern.behavioral.template_method;

public abstract class Reader {

	public abstract void read();

	public void processDataAndSave() {
		read();
		System.out.println("Processesing read data and ssaving it to db");
	}

	public void buildAnalyticsForData() {
		read();
		System.out.println("Building analytics for the data");
	}
}
