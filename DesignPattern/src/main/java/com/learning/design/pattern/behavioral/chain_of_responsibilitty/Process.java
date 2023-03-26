package com.learning.design.pattern.behavioral.chain_of_responsibilitty;

public abstract class Process {

	protected Process process;

	public Process(Process process) {
		this.process = process;
	}

	public void process(NumberCustom req) {
		if (this.process != null) {
			process.process(req);
		}
	}
}
