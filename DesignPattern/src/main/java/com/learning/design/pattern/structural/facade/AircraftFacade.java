package com.learning.design.pattern.structural.facade;

public class AircraftFacade {

	private EngineSpeedMonitor engineController;
	private FuelCheckMonitor fuelCheckController;
	private NavigationMonitor navigationMonitor;

	AircraftFacade(EngineSpeedMonitor engineController, FuelCheckMonitor fuelCheckController,
			NavigationMonitor navigationMonitor) {
		this.engineController = engineController;
		this.fuelCheckController = fuelCheckController;
		this.navigationMonitor = navigationMonitor;
	}

	public void autoPilotOn() {
		engineController.checkEngineHelth();
		fuelCheckController.checkFuelLeft();
		navigationMonitor.validatingNavigation();
	}

	public void autoPilotOff() {
		engineController.stopEngineHealthCheck();
		fuelCheckController.stopCheckOfFuel();
		navigationMonitor.stopNavigationValidation();
	}
}
