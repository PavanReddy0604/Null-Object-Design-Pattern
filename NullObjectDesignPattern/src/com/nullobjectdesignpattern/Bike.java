package com.nullobjectdesignpattern;

public class Bike implements Vehicle{

	@Override
	public void getMilage(String name) {
		
		System.out.println(name +" Bike gives milage of 40 KM per litre");
	}

	@Override
	public void getSeatCapacity(int capacity) {
		System.out.println(" Bike seating capacity is : "+capacity);
		
	}
	
	
	

}
