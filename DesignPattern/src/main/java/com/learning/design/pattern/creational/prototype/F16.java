package com.learning.design.pattern.creational.prototype;

public class F16 implements IAircraft {

	private boolean isCockpitBuilded = false;
	private boolean isBodyBuilded = false;
	private boolean isWingsBuilded = false;
	private boolean makeSnaksAvailable = false;

	@Override
	public IAircraft clone() {
		F16 f16 = new F16();
		f16.isBodyBuilded = this.isBodyBuilded;
		f16.isCockpitBuilded = this.isCockpitBuilded;
		f16.isWingsBuilded = this.isWingsBuilded;
		f16.makeSnaksAvailable = this.makeSnaksAvailable;
		return f16;
	}

	@Override
	public void setCockpitBuilded(boolean isCockpitBuilded) {
		this.isCockpitBuilded = isCockpitBuilded;
	}

	@Override
	public void setBodyBuilded(boolean isBodyBuilded) {
		this.isBodyBuilded = isBodyBuilded;
	}

	@Override
	public void setWingsBuilded(boolean isWingsBuilded) {
		this.isWingsBuilded = isWingsBuilded;
	}

	@Override
	public void setMakeSnaksAvailable(boolean makeSnaksAvailable) {
		this.makeSnaksAvailable = makeSnaksAvailable;
	}

	public boolean isCockpitBuilded() {
		return isCockpitBuilded;
	}

	public boolean isBodyBuilded() {
		return isBodyBuilded;
	}

	public boolean isWingsBuilded() {
		return isWingsBuilded;
	}

	public boolean isMakeSnaksAvailable() {
		return makeSnaksAvailable;
	}

}
