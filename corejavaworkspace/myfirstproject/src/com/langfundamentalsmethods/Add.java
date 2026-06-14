package com.langfundamentalsmethods;

import java.util.Scanner;

public class Add {
	int a=20;
	int b=30;

	void main() {
		System.out.println("Main method started");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter x value: ");
		int x=sc.nextInt();
		System.out.println("enter y value: ");
		int y=sc.nextInt();
		System.out.println("enter z value: ");
		int z=sc.nextInt();
		System.out.println("enter x1 value: ");
		float x1=sc.nextFloat();
		System.out.println("enter y1 value: ");
		float y1=sc.nextFloat();
		System.out.println("enter d value: ");
		double d=sc.nextDouble();
		System.out.println("enter d2 value: ");
		double d2=sc.nextDouble();
		System.out.println("enter string vaue: ");
		String s=sc.next();//takes only one word
		System.out.println("enter string val: ");
		String s1=sc.nextLine();
		add6(s1);
		add();
		add1(x,y);
		add2(x,y,z);
		add3(x1,y1);
		add4(d,d2);
		add5(s);
	}
	void add() {
		System.out.println("sum of "+a+"+"+b+" is: "+(a+b));
	}
	void add1(int x,int y) {
		System.out.println("sum of " +x+ "+" +y+" is: "+(x+y));
	}
	void add2(int x,int y,int z ) {
		System.out.println("sum of " +x+ "+" +y+ "+" +z+" is: "+(x+y+z));
	}
	void add3(float x,float y) {
		System.out.println("sum of"+x+"+"+y+"is:"+(x+y));
	}
	void add4(double d,double d2) {
		System.out.println("sum of"+d+"+"+d2+"is:"+(d+d2));
	}
	void add5(String s) {
		System.out.println("Name is: "+s);
	}
	void add6(String s1) {
		System.out.println("sentence is: "+s1);
	}
}
