package com.yedam.inter2;

public class LaunduryExample {

	public static void main(String[] args) {
		Laundury laundury;
		Dry dry;
		LG lg=new LG();
		dry=lg;
		dry.Dry();
		laundury=lg;
		laundury.start();
		laundury.stop();
		laundury.quit();
		laundury.speed(3);


	}

}
