package com.langfundamentalsmethods;

public class TestMethods {
	public static void add() {
		int a=10;
		int b=20;
		long c=8347583749L;
		long c1=87437583275L;
		System.out.println("addition of c and c1 is:" + (c+c1));
		System.out.println("addition of a and b is:" + a+b);//1020
		System.out.println("addition of a and b is:" + (a+b));//30
	}
	public static void sub() {
		float f=5444.3f;
		float f1=654.32f;
		System.out.println("addition of f and f1 is:" + (f+f1));//6098.6196
	}
//	bodmass rule
	public static void mul() {
		int m=897678;
		int m1=932442;
		System.out.println("multiplication of m and m1 is:"+m*m1);
	}
	public static void div() {
		int d=8976754;
		int d1=932562;
		System.out.println("division of d and d1 is:" + d/d1);
	}
	public static void mod() {
		int p=897678;
		int p1=9324442;
		System.out.println("modulus of p and p1 is:"+p%p1);
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		add();
		sub();
		mul();
		mod();
		div();
	}
}
