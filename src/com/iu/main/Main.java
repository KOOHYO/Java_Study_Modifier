package com.iu.main;

import com.iu.terran.Marine;
import com.iu.terran.Scv;
import com.iu.unit.Unit;
import com.iu.zarg.Hydra;

public class Main {

	public static void main(String[] args) {
		
		Marine m1 = new Marine();
		Scv s1 = new Scv();
		
		//Marine is a Unit
		//Scv    is a Unit
		
		Unit unit = m1;//자식클래스에서 부모클래스에 대입
		Hydra hydra = new Hydra();
		
		m1.attack();
		hydra.attack();
		
		
		
		
		System.out.println(unit.getHp()); //Unit이 가지고있는건 name까지이다. Marine에 있는 weapon이 있다
		System.out.println(unit.getColor());
		System.out.println(unit.getName());
		
		m1 = (Marine)unit;//여기에 Scv를 넣으면 에러 발생 부모클래스가 자식클래스로 대입은 안됀다 여기서 다형성
		
		System.out.println(m1.getWeapon());
		
	}
}
