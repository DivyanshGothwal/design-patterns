package com.learning.design.pattern.creational.prototype;

public class Boeing747 implements IAircraft {

	private boolean isCockpitBuilded;
	private boolean isBodyBuilded;
	private boolean isWingsBuilded;
	private boolean makeSnaksAvailable;

	@Override
	public IAircraft clone() {
		Boeing747 b = new Boeing747();
		b.isBodyBuilded = this.isBodyBuilded;
		b.isCockpitBuilded = this.isCockpitBuilded;
		b.isWingsBuilded = this.isWingsBuilded;
		b.makeSnaksAvailable = this.makeSnaksAvailable;
		return b;
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
