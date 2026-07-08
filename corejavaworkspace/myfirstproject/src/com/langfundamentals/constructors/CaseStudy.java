package com.langfundamentals.constructors;

public class CaseStudy {
	int Productid;
	String Productname;
	String brand;
	double price;
	int warranty;
	
	 CaseStudy(int productid, String productname, String brand, double price, int warranty) {
		this.Productid = productid;
		this.Productname = productname;
		this.brand = brand;
		this.price = price;
		this.warranty = warranty;
	}
	public CaseStudy(CaseStudy c) {
		this.Productid = c.Productid;
		this.Productname =c. Productname;
		this.brand = c.brand;
		this.price = c.price;
		this.warranty = c.warranty;
	}

	public static void main(String[] args) {
		CaseStudy c1=new CaseStudy(1,"avc","bbb",7500.00,2);
		c1.display();
		CaseStudy c2=new CaseStudy(c1);
		c2.display();
	}
	void display() {
		System.out.println("Productid : "+Productid);
		System.out.println("Productname : "+Productname);
		System.out.println("brand : "+brand);
		System.out.println("price : "+price);
		System.out.println("warranty : "+warranty);
		System.out.println("********************************");

	}

}
