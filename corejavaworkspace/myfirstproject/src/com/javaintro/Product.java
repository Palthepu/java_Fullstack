package com.javaintro;

public class Product {
	static String storename="mart";
		int productid;
		String productname;
		int productprice;
		void details() {
			System.out.println(storename);
			System.out.println(productid);
			System.out.println(productname);
			System.out.println(productprice);
		}

	public static void main(String[] args) {
		Product p = new Product();
		p.productid=12;
		p.productname="mobile";
		p.productprice=6000;
		p.details();
		Product p1 = new Product();
		p1.productid=13;
		p1.productname="laptop";
		p1.productprice=60000;
		p1.details();
	}

}
