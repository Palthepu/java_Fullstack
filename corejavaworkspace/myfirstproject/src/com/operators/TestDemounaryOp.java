package com.operators;

public class TestDemounaryOp {

	public static void main(String[] args) {
		int a=12;
		int b=23;
		System.out.println(a++);
		System.out.println(b++);
		System.out.println(++a);
		System.out.println(++b);
		System.out.println(--a);
		System.out.println(--b);
		System.out.println(++a);
		System.out.println(a);
		System.out.println(b);
		int m=7;
		System.out.println(m++ + --m + ++m);
		int x=3;
		System.out.println(x++ + ++x +x-- +--x);
	}

}
