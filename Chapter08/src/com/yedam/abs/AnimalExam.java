package com.yedam.abs;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog =new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------------");
		
		//추상클래스 다형성으로 표현
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println(animal.kind);
		
		animalSound(new Cat());
		animalSound(new Dog());
		
	
	}
	
	//매개변수의 다형성을 활용한 추상클래스 사용
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	//추상 클래스 특징이 반드시 만들어라고 한 메소드가 있음으로
	//무조건적으로 사용되는 구문이기에 메소드의 다형성을 이용하여 하나로 활용.
	
}
