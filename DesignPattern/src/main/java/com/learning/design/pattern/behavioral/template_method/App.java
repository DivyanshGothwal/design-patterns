package com.learning.design.pattern.behavioral.template_method;

public class App {

	public static void main(String a[]) {
		Reader r = new CsvReader();
		r.buildAnalyticsForData();
		r.processDataAndSave();
	}
}
