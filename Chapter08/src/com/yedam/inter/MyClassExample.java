package com.yedam.inter;

public class MyClassExample {

	public static void main(String[] args) {
		//p380
//		RemoteControl rc = new Television();
//		MyClass(RemoteControl rc){
//			this.rc = rc;
//		}
		System.out.println("(1)=====");
		
		//클래스 내부에 인터페이스를 활용하여 필드로 선언
		MyClass myClass1 = new MyClass();
		//Television Class instance
		
		System.out.println(myClass1.rc);
		//객체 안에 객체
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		myClass1.rc.turnOff();
		
		System.out.println("(2)=====");
		
		MyClass myClass2=new MyClass(new Audio());
		//생성자 안에 들어가있는 구문 작동
		
		myClass2.rc.turnOn();
		myClass2.rc.setVolume(3);
		myClass2.rc.turnOff();
		
		System.out.println("(3)=====");
		
		MyClass myClass3 = new MyClass();
		
		myClass3.methodA();
		
		System.out.println("(4)=====");
		MyClass myClass4=new MyClass();
		myClass4.methodB(new Television());
		
//		System.out.println("(4)=====");
//		myClass1.methodB(new Audio());
//		myClass2.methodB(new SmartTV());
		
			
		
	}

}
