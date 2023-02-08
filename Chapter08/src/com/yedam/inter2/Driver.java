package com.yedam.inter2;

public class Driver {
	public void driver(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus=(Bus) vehicle;
			bus.run();
			bus.checkFare();
		}
		vehicle.run();
	}
}
