package com.yedam.inter;

public interface RemoteControl {
	//상수 => static final이 생략
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	//public static final int MIN_VOLUME=0;이나 위에 적용한 것이나 차이 x
	
	
	//추상메소드 => abstract 생략
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	//추상메소드도 매개변수를 줄 수 있다.
}
