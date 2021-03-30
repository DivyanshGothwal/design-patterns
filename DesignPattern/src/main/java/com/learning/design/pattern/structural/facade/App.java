package com.learning.design.pattern.structural.facade;

public class App {

	public static void main(String ar[]) {
		EngineSpeedMonitor esm = new EngineSpeedMonitor();
		FuelCheckMonitor fcc = new FuelCheckMonitor();
		NavigationMonitor nm = new NavigationMonitor();
		AircraftFacade af = new AircraftFacade(esm, fcc, nm);
		af.autoPilotOn();
		af.autoPilotOff();
	}
}