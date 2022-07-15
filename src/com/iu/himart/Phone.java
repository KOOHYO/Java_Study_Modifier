package com.iu.himart;

import co.iu.product.Product;

public class Phone extends Product{

	private String company;
	
	public Phone () {
		this.company = "SamSung";
		this.setBrand("Flip");
		this.setPrice(500000);
		this.setPoint(50);
	}
	
	public void info() {
		super.info();
		System.out.println("Company : "+this.company);
		
	}
	
}
