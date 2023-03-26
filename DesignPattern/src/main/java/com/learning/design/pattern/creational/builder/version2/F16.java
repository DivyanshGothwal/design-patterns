package com.learning.design.pattern.creational.builder.version2;

public class F16 implements IAircraft {

	private boolean isCockpitReady;
	private boolean isPassangerReady;
	private boolean isEngineReady;

	@Override
	public boolean getCockpit() {
		return this.isCockpitReady;
	}

	@Override
	public boolean getEngine() {
		return this.isEngineReady;
	}

	@Override
	public boolean getPasssenger() {
		return this.isPassangerReady;
	}

	@Override
	public void setCockpit(boolean val) {
		this.isCockpitReady = val;
	}

	@Override
	public void setEngine(boolean val) {
		this.isEngineReady = val;
	}

	@Override
	public void setPasssenger(boolean val) {
		this.isPassangerReady = val;
	}
}
