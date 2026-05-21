package com.javaintro;

public class Cricketer {
	int jno;
	String name;
	
	static int countryId;
	static String countryName;
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Indian cricket team");
		System.out.println("******************Object1 info****************");
		countryId=91;
		countryName="India";
		System.out.println(countryId);
		System.out.println(countryName);
		System.out.println("*****************object2 info***********");
		Cricketer msd=new Cricketer();
		System.out.println(msd.jno);
		System.out.println(msd.name);
		
	}

}
