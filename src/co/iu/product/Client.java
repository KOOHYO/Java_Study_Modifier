package co.iu.product;

import com.iu.himart.Computer;
import com.iu.himart.Phone;
import com.iu.himart.Tv;

public class Client {

	private int money;
	private int point;
	
	public Client() {
		this.money = 30000000;//위 아래 둘다가능
		this.setPoint(10);
	}
	
	public void buy(Tv tv) {
		//3천만-100만원
		this.money = this.money-tv.getPrice();
		//10+100
		this.point = this.point+tv.getPrice();
		
		System.out.println("잔액 : "+this.money);
		System.out.println("Point : "+this.point);
		
	}
	
	public void buy(Computer computer) {
		
		this.money = this.money-computer.getPrice();
		this.point = this.point+computer.getPrice();
		
		System.out.println("잔액 : "+this.money);
		System.out.println("Point : "+this.point);
		
	}
	
	public void buy(Product product) {
		
		this.money = this.money-product.getPrice();
		this.point = this.point+product.getPrice();
		
		System.out.println("잔액 : "+this.money);
		System.out.println("Point : "+this.point);
		
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
}
