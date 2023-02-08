package com.yedam.inter2;

public class LG implements Dry, Laundury {
	
	
	@Override
	public void start() {
		System.out.println("세탁기를 켭니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("세탁기를 멈춥니다.");
		
	}

	@Override
	public void quit() {
		System.out.println("세탁기를 끕니다.");
		
	}



	@Override
	public void Dry() {
		System.out.println("건조를 시작합니다.");
		
	}

	@Override
	public void speed(int speed) {
		int nowspeed=0;
		if(speed==1) {
			nowspeed=20;
			
		}else if(speed==2) {
			nowspeed=50;
		}else if(speed==3) {
			nowspeed=100;
		}else {
			System.out.println("속도는 1~3의 범위 안으로 설정해주세요");
		}
		System.out.println("현재 속도 : "+nowspeed+"입니다.");
	}
	
}
