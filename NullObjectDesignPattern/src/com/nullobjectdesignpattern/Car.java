package com.nullobjectdesignpattern;

public class Car implements Vehicle {
	
	public void getMilage(String name) {
		System.out.println(name+" car gives milage of 22 KM per litre ");
		
	}
	public void getSeatCapacity(int capacity) {
		System.out.println(" car seating capacity is : "+capacity);
	}
	

}
