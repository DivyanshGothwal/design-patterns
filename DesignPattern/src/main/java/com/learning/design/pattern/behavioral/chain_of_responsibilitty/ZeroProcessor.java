package com.learning.design.pattern.behavioral.chain_of_responsibilitty;

public class ZeroProcessor extends Process {

	public ZeroProcessor(Process process) {
		super(process);
	}

	@Override
	public void process(NumberCustom req) {
		System.out.println("Zero processor started");
		if (req.i == 0) {
			System.out.println("number greater than 0");
		} else {
			super.process(req);
		}
	}
}
