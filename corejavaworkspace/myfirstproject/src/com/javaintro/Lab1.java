package com.javaintro;

public class Lab1 {
	static int count=0;
	 {
		count++;
	}
	public static void main(String[] args) {
		Lab1 l1 = new Lab1();
		Lab1 l2 = new Lab1();
		System.out.println(count);
	}

}
