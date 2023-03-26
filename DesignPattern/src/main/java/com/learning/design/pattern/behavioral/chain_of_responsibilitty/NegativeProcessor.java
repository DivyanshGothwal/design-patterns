package com.learning.design.pattern.behavioral.chain_of_responsibilitty;

public class NegativeProcessor extends Process {

	public NegativeProcessor(Process process) {
		super(process);
	}

	@Override
	public void process(NumberCustom req) {
		System.out.println("Negative processor started");
		if (req.i < 0) {
			System.out.println("number less that 0");
		} else {
			super.process(req);
		}
	}

}
