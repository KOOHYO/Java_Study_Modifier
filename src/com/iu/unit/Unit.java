package com.iu.unit;

public abstract class Unit { // abstract 은 추상적이다 상속해서만 쓸 수 있다.

	//클래스간의 공통 요소
	private int hp;
	private String color;
	private String name;
	
	public Unit() {
		System.out.println("Super 생성자");
		//this.hp = hp;
	}
	
	//
	public abstract void move();//abstract 완성되지 않은 메서드이다. 쓸려면 완성 시킨 후 써야한다.
	
	public void info() {
		System.out.println("Super Info");
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
