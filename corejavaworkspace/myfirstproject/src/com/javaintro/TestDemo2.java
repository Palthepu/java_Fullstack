package com.javaintro;

public class TestDemo2 {
	static {
		System.out.println("Static block1 loaded");
		TestDemo2 t2 = new TestDemo2();
	}
	static{
		System.out.println("static block2 loaded");
	}
	{
		System.out.println("instance block1 loaded");
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		TestDemo2 t2 = new TestDemo2();
	}
	
}
