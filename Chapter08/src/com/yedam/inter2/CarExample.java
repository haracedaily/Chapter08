package com.yedam.inter2;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		System.out.println("================");
		myCar.frt = new HankookTire();
		myCar.run();
	}
	
}
