package com.nullobjectdesignpattern;

public class VehicleFactory {
	
	private static Vehicle vehicle;
	
	public static Vehicle getVehicleInstance(String vehicle) {
		if(vehicle.equalsIgnoreCase("car")) {
			return new Car();
		}
		else 
			if(vehicle.equalsIgnoreCase("bike")){
			return new Bike();
		}
		
		else {
			return new nullVehicle();
		}
		
	}
	
	
	public static Vehicle getVehicleInstance2(String vehicle) {
		if(vehicle.equalsIgnoreCase("car")) {
			return new Car();
		}
		else 
			if(vehicle.equalsIgnoreCase("bike")){
			return new Bike();
		}
		
		else {
			return null;
		}
		
	}

}
