package com.yedam.inter2;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver =new Driver();
		
		driver.driver(new Bus());
		driver.driver(new Taxi());
		System.out.println("=============");
		Vehicle v1 = new Bus();
		v1.run();
		Bus b1 = (Bus) v1;
		System.out.println("=============");
		b1.checkFare();
		b1.run();
		System.out.println("=============");
		
	}

}
