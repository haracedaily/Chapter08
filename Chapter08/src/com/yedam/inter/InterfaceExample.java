package com.yedam.inter;

public class InterfaceExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(12);
		rc.setVolume(-1);
		rc.turnOff();
		
		SmartTV tv=new SmartTV();
		//SmartTV->2개의 인터페이스를 상속
		//결론은 둘다 다형화 가능하지만, 각 인터페이스에 속한 메소드만 사용가능
		
		RemoteControl rc2 = tv;
		Searchable search = tv;
		
		rc2.setVolume(10);
		rc2.turnOff();
		rc2.turnOn();
//		rc2.search("www.naver.com"); 이렇게는 사용이 불가능하다 
		search.search("www.naver.com"); //근데 그냥 구현클래스로 쓰면 안되나..?
		System.out.println();
		tv.turnOn();
		tv.search("www.naver.com");
		tv.setVolume(15);
		tv.turnOff();
	}

}
