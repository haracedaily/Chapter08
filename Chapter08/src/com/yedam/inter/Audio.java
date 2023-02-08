package com.yedam.inter;

public class Audio implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			System.out.println("\n볼륨의 최대값은 10입니다.");
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			System.out.println("\n볼륨의 최소값은 0입니다.");
			this.volume=RemoteControl.MIN_VOLUME;
		}else{
			this.volume=volume;
			System.out.println("현재 볼륨은 "+this.volume+"입니다.");
		}
		System.out.println("현재 Audio 볼륨 : "+this.volume);
	}

}
