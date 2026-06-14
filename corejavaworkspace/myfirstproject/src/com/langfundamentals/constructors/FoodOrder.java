package com.langfundamentals.constructors;
//parameterized constructor

public class FoodOrder {
	int orderid;
	String CustomerName;
	String RestuarantName;
	String itemname;
	int quantity;
	double price;
	
	FoodOrder(){
		System.out.println("No arg constructor");
		orderid=1;
		CustomerName="abc";
		RestuarantName="xyz";
		itemname="cake";
		quantity=1;
		price=350.0;
	}
	FoodOrder(int orderid,String CustomerName,String itemname){
		this.orderid=orderid;
		this.CustomerName=CustomerName;
		this.itemname=itemname;
	}
	FoodOrder(int orderid,String CustomerName,String RestuarantName,String itemname,int quantity){
		this.orderid=orderid;
		this.CustomerName=CustomerName;
		this.RestuarantName=RestuarantName;
		this.itemname=itemname;
		this.quantity=quantity;
	}
	FoodOrder(int orderid,String CustomerName,String RestuarantName,String itemname,int quantity,double price){
		this.orderid=orderid;
		this.CustomerName=CustomerName;
		this.RestuarantName=RestuarantName;
		this.itemname=itemname;
		this.quantity=quantity;
		this.price=price;
	}
	public static void main(String[] args) {
		FoodOrder f1=new FoodOrder();
		f1.display();
		FoodOrder f2=new FoodOrder(101,"siva","ChickenBiryani");
		f2.display();
		FoodOrder f3=new FoodOrder(102,"Reddy","paradise","muttonbiryani",2);
		f3.display();
		FoodOrder f4=new FoodOrder(103,"Kumar","Mehfil","friedrice",3,450);
		f4.display();
	}
	void display() {
		System.out.println("orderid is: "+orderid);
		System.out.println("customername is: "+CustomerName);
		System.out.println("Restuarant name: "+RestuarantName);
		System.out.println("itemname is: "+itemname);
		System.out.println("quantity: "+quantity);
		System.out.println("price: "+price);
		System.out.println("********************");
	}

}
