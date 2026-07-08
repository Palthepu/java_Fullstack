package com.operators;

public class Swap {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("a value before swaping: "+a);
		System.out.println("b value before swaping: "+b);
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println("a value after swaping is:"+a);
		System.out.println("b value after swaping is:"+b);	
		
	}

}
