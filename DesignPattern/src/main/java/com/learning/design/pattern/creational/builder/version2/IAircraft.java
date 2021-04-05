package com.learning.design.pattern.creational.builder.version2;

public interface IAircraft {

	public boolean getCockpit();
	public boolean getEngine();
	public boolean getPasssenger();

	public void setCockpit(boolean val);
	public void setEngine(boolean val);
	public void setPasssenger(boolean val);
}
