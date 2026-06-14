package com.langfundamentals.constructors;
//parameterized constructor

public class Product {
	 int pid;
	 String pname;
	 double price;
	 int quantity;
	 
	 Product(){
		 System.out.println("No arg constructor");
		 this.pid=1;
		 this.pname="abc";
		 this.price=234.00;
		 this.quantity=20;
	 }
	 Product(int pid){
		 this.pid=pid;
	 }
	 Product(String pname){
		  this.pname=pname;
	 }
	 Product(double price){
		 this.price=price;
	 }
	 Product(int quantity,int pid){
		 this.pid=pid;
	 }
	 Product(int pid,double price){
		 this.pid=pid;
		 this.price=price;
	 }
	 Product(int pid,String pname,double price,int quantity){
		 this.pid=pid;
		 this.pname=pname;
		 this.price=price;
		 this.quantity=quantity;
	 }
	 Product(int pid,String pname){
		 this.pid=pid;
		 this.pname=pname;
	 }
	 Product(String pname,double price){
		 this.pname=pname;
		 this.price=price;
	 }
	 Product(float price){
		 this.price=(int)price;
	 }
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.display();
		Product p2 = new Product(12);
		p2.display();
		Product p3 = new Product("AC");
		p3.display();
		Product p4 = new Product(1500);
		p4.display();
		Product p5 = new Product(1,21);
		p5.display();
		Product p6 = new Product(23,2300);
		p6.display();
		Product p7 = new Product(34,"Tv",340000,3);
		p7.display();
		Product p8 = new Product(45,"cooler");
		p8.display();
		Product p9=new Product("mobile",23000);
		p9.display();
		Product p10=new Product(198.0);
		p10.display();

	}
	void display() {
		System.out.println("Productid: "+pid);
		System.out.println("productname: "+pname);
		System.out.println("productprice: "+price);
		System.out.println("quantity: "+quantity);
        System.out.println("----------------------------");

	}
}
