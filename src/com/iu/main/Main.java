package com.iu.main;

import com.iu.animal.Cat;
import com.iu.animal.Human;
import com.iu.animal.Zoo;

public class Main {

	public static void main(String[] args) {
		//Cat cat = new Cat();
		//cat.sound();
		//cat.age = 5;
		Human human = new Human();
		//Human.age = 500;
		human.setAge(200);
		human.info(); //메서드 통해서 Human의 age를 접근 할 수있다
		//-------------------------------------------------
		System.out.println(Zoo.title);
		Zoo.info();
		
		Zoo zoo = new Zoo();
		//zoo.price = 10000; -> final은 변경할 수 없기 때문에 에러가 생긴다
		
	}

}
