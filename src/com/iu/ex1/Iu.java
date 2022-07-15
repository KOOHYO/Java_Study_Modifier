package com.iu.ex1;

public class Iu {

	private String name;
	private int age;
	//fix-study(깃허브 백업 테스트)
	private String test;
	
	private static Iu iu=null;
	
	public static Iu getInstance() {
		if(Iu.iu == null) {
			Iu.iu = new Iu();
		}
		return Iu.iu;
	}
	
	private Iu(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Setter
	//public void set변수명(데이터타입 변수명=매개변수 선언){}
	//데이터를 받아오기만 하는 용도
	
	//Getter
	//public 리턴타입 get변수명(){} 꺼내서 호출한곳에 주기만한다. 그래서 매개변수가 필요없다!
	//source > Generate Getters Setters
	
}
