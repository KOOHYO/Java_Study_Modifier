package com.iu.animal;

public class Human {

	private int age;
	
	public int getAge() {//get으로 시작하는 메서드명은 데이터를 꺼내오는것
		return this.age;
	}
	
	public void setAge(int age) {//set으로 시작하는 메서드명은 데이터를 넣는것
		this.age = 0;
		if(0<=age&&age<150) {
			this.age = age;
		}
//		if(0<=age&&age<150) {
//			this.age = age;
//		}else {
//			this.age = 0;
//		}
	}
	
	public void info() {
		System.out.println(this.age);
	}
	
	public void myPet() {
		Cat cat = new Cat();
		//cat.age = 10;
		cat.sound();
	}
	
}
