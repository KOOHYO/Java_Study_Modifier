package com.iu.animal;

public class Cat {

	private int age;
	
	void sound() {//public 은 아무대서나 사용가능(다른패키지에서도)
		age = 10;
		System.out.println("냐옹");
	}
	
	Cat() {
		
	}
	
}
