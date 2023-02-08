package com.yedam.inter;

public class MyClass {
	//인터페이스 사용할 수 있는 공간
	//1. 필드
	RemoteControl rc=new Television();//Myclass.rc.~
	//String str="문자열";
	
	//2.생성자
	public MyClass() {
		//필드값이 여기 들어감 즉, TV vers로 만들어짐
	}//Television이 들어감
	
	public MyClass(RemoteControl rc) {
		this.rc=rc;
		rc.turnOn();
		rc.turnOff();
	}//Television or Audio 둘다 들어갈 수 있음
	//3. 메소드
	public void methodA() {
		//로컬 변수 사용
		RemoteControl rc=new Audio();
		rc.turnOn();
		rc.turnOff();
	}//Audio고정
	public void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(2);
		rc.turnOff();
	}//생성자와 같은 방식 즉, audio tv둘다 적용 가능
	
	
}
