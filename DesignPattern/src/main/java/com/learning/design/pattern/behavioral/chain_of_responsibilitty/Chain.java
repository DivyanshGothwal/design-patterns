package com.learning.design.pattern.behavioral.chain_of_responsibilitty;

public class Chain {

	public Process process;
	
	public void process(NumberCustom req) {
		process.process(req);
	}
}
