package com.langfundamentals.constructors;


class productt{
	String name;
	String brand;
	double price;
	public static void main(String[] args) {
		System.out.println("main method started from product");
	}
}
public class Mobile extends productt {
	String name="10R";
	String brand="oneplus";
	double price=40000.00;

	public static void main(String[] args) {
		System.out.println("main method started from mobile");
		
		Mobile m1=new Mobile();
		m1.mobileinfo();
	}
	void mobileinfo() {
		System.out.println(name);
		System.out.println(brand);
		System.out.println(price);
	}

}
