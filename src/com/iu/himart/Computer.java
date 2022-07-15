package com.iu.himart;

import co.iu.product.Product;

public class Computer extends Product {

	private String cpu;
	
	public Computer() {
		this.cpu = "M2";
		this.setBrand("MacMini");
		this.setPrice(2000000);
		this.setPoint(200);
	}
	
	public void info() {
		super.info();
		System.out.println("CPU : "+this.cpu);
	}
	
}
