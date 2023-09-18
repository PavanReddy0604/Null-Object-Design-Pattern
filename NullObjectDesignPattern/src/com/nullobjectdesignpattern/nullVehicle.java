package com.nullobjectdesignpattern;

public class nullVehicle implements Vehicle {

	@Override
	public void getMilage(String name) {
		System.out.println("null vehicle / Default vehicle ");

	}

	@Override
	public void getSeatCapacity(int capacity) {
		System.out.println(" default seating capacity ");

	}

}
