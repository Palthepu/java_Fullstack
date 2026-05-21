package com.javaintro;

public class TestDemo4 {
	static {
		Hello();
	}
	static void Hello() {
		System.out.println("method1 started");
		TestDemo4 t4=new TestDemo4();
		t4.Hello1();
		t4.Hello2();
	}
	void Hello1() {
		System.out.println("Method2 started");
	}
	void Hello2() {
		System.out.println("Method3 started");
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
	}
}
