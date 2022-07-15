package com.iu.himart;

import co.iu.product.Product;

public class Tv extends Product {

	private int size;
	
	public Tv () {
		this.size = 100;
		this.setBrand("Tv");
		this.setPrice(1000000);
		this.setPoint(100);
	}
	
	public void info() {
		super.info();
		System.out.println("Size : "+this.size);
	}
	
}
