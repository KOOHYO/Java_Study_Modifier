package com.iu.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		//싱글톤 (디자인 패턴, MVC2-객체를 만드는 형식)
		
		Iu iu = Iu.getInstance();//getInstance 어디서 가지고온다
		iu.setName("iu");
		iu.setAge(30);
		
		String name = iu.getName();
		
		System.out.println(name);
		System.out.println(iu.getAge());
		System.out.println(iu);
		System.out.println("========================");
		Iu iu2 = Iu.getInstance();
		System.out.println(iu2.getName());
		System.out.println(iu2.getAge());
		System.out.println(iu2);

	}

}
