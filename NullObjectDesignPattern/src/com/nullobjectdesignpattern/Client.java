package com.nullobjectdesignpattern;

public class Client {

	public static void main(String[] args) {
		
	// If we are not using Null Object Design pattern
		
		
		/*
		 * 
		 * Vehicle yamaha = VehicleFactory.getVehicleInstance2("bike");
		 *  if(yamaha!=null){
		 * yamaha.getMilage("yamaha");
		 *  yamaha.getSeatCapacity(2);
		 *  }
		 *   Vehicle jcb =VehicleFactory.getVehicleInstance2("jcb"); 
		 *   if(jcb!=null) {
		 *    Vehicle jcb2 =
		 * VehicleFactory.getVehicleInstance2("jcb"); jcb2.getMilage("JCB 2");
		 * jcb2.getSeatCapacity(3); 
		 * }
		 */
		
		
		Vehicle yamaha = VehicleFactory.getVehicleInstance("bike");
		yamaha.getMilage("yamaha");
		yamaha.getSeatCapacity(2);
		
		
		Vehicle jcb = VehicleFactory.getVehicleInstance("jcb");
		jcb.getMilage("jcb");
		jcb.getSeatCapacity(3);
		
		
	

	}

}
