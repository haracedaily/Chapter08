package com.yedam.inter2;

public class Example {

	public static void main(String[] args) {
		ImplementsC impl = new ImplementsC();
		//interfaceA~C까지 impl을 활용해서 메소드 호출
		InterfaceA ia = impl;
		ia.method01();
		
		InterfaceB ib = impl;
		ib.method02();

		InterfaceC ic = impl;
			ic.method01();
			ic.method02();
			ic.method03();
	}

}
