package com.javaintro;
	
public class Bank {
	static int serial=123570;
	int accno=1;
	String name;
	int balance;
	int mobile;
	
	{
		serial++;
		System.out.println(serial);
	}
	void display() {
		System.out.println(name);
		System.out.println(balance);
		System.out.println(mobile);
	}
	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.name="meghana";
		b1.balance=500;
		b1.mobile=12345678;
		b1.display();
		Bank b2 = new Bank();
		b2.name="Archana";
		b2.balance=600;
		b2.mobile=12345679;
		b2.display();
		Bank b3 = new Bank();
		b3.name="Archanaa";
		b3.balance=600;
		b3.mobile=12345679;
		b3.display();
	}

}
