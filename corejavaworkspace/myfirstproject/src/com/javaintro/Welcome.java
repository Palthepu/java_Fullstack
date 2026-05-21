package com.javaintro;

public class Welcome {
	int jno;
	String jname;
	
	static int countryid;
	static String countryname;
	
	public static void main(String[] args) {
		System.out.println("Hello Vcube");
		System.out.println(countryid);
		System.out.println(countryname);
		Welcome W1 = new Welcome();
		W1.jno=7;
		W1.jname="msd";
		System.out.println(W1.jno);
		System.out.println(W1.jname);
	}

}
