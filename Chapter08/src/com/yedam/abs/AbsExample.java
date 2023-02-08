package com.yedam.abs;

public class AbsExample {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("박또치");
		Phone sp1=new SmartPhone("이또치");
		
		sp.internetSearch();
		sp.turnOn();
		sp.turnOff();
		sp1.turnOff();
		sp1.turnOn();

	}

}
