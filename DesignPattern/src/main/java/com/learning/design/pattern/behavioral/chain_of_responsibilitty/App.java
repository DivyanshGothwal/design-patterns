package com.learning.design.pattern.behavioral.chain_of_responsibilitty;

public class App {

	public static void main(String[] args) {
		
		Chain c = new Chain();
		c.process = new NegativeProcessor(null);
		c.process = new PositiveProcessor(c.process);
		c.process = new ZeroProcessor(c.process);
		c.process(new NumberCustom(1));
	}
}
