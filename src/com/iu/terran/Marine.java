package com.iu.terran;



import com.iu.unit.Unit;//import는 여기에 Unit이라는 클래스가 있다고 얘기해주는것

public class Marine extends Unit { //패키지명을 클래스명 앞에 써줘야한다

	
	
	private String weapon;
	
	public Marine() {
		super();//부모의 생성자를 호출하는것이 생략되어 있다.
		System.out.println("Marine 생성자");
	}
	
	public String getWeapon() {
		return weapon;
	}
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	//오버라이딩
	public void move() {
		System.out.println("뛰어다님");
	}
	//여기서 이것은 오버라이딩이다 (Unit으로 상속받았는데 중복이아니라 오버라이딩이다)
	public void info() {
		super.info();//부모영역의 주소! 여기서 본인영역의 주소인 this.()도 쓸 수 있다
		System.out.println("Marine info");
	}
	
	public void shoot() {
		System.out.println("우다다다닫");
	}
	
}
