package com.learning.design.pattern.creational.prototype;

public interface IAircraft {

	public abstract IAircraft clone();

	public void setCockpitBuilded(boolean isCockpitBuilded);

	public void setBodyBuilded(boolean isBodyBuilded);

	public void setWingsBuilded(boolean isWingsBuilded);

	public void setMakeSnaksAvailable(boolean makeSnaksAvailable);

	public boolean isCockpitBuilded();

	public boolean isBodyBuilded();

	public boolean isWingsBuilded();

	public boolean isMakeSnaksAvailable();

}
