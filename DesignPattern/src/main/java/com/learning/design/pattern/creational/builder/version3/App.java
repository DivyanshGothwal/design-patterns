package com.learning.design.pattern.creational.builder.version3;

public class App {

	public static void main(String[] args) {
		F16 f16 = F16.builder().cockpitReady(true).engineReady(false).passangerReady(true).build();
		System.out.print("Engine ready"+f16);
	}
}
