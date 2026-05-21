package com.javaintro;

public class TestDemo3 {
	static void Method1(){
		System.out.println("Method1 started");
		TestDemo3 t1 = new TestDemo3();
		t1.Method2();
	}
	void Method2() {
		System.out.println("Method2 started");
		Method3();
	}
	void Method3() {
		System.out.println("Method3 started");
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		Method1();
	}
}
