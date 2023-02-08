package com.yedam.abs;

public abstract class Phone {
	//필드
	public String owner;
	//생성자
	public Phone(String owner) {
		this.owner=owner;
	}
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	//상속 받은 실체 클래스(자식클래스)에서 반드시 구현해야하는 기능.
	public abstract void turnOff();
}
