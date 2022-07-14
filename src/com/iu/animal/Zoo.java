package com.iu.animal;

public class Zoo {
	
	//멤버변수
	//접근지정자 [그외지정자] 데이터타입 변수명;
	//클래스변수
	public static String title = "사파리";//static으로 선언하면 변수명 글자가 기울어져있음
	
	//인스턴스변수
	public final int PRICE = 50000;//스네이크표시(_)로 두단어 이상을 표현한다 변수명이 모두 대문자이면 상수형 변수
	
	//멤버메서드 선언
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수 선언]){}
	//클래스메서드
	public static void info() {//객체를 만들지 않고 
		System.out.println("Static Method");
		System.out.println(Zoo.title);
		//System.out.println(price);
		//getPrice();
	}
	
	//인스턴스메서드
	public void getPrice() {//인스턴스변수 인스턴스메서드 등은 호출 가능
		System.out.println(PRICE);
		System.out.println(Zoo.title);
		Zoo.info();
	}
	
}
