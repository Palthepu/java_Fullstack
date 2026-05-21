package com.javaintro;

public class TestDemo5 {
	static void Method1(){
		TestDemo5 t5 = new TestDemo5();
		t5.Method2();
		t5.Method3();
		System.out.println("method1");
		Method5();
	}
	void Method2() {
		System.out.println("Method2");	
	}
	void Method3() {
		System.out.println("Method3");	
		Method4();
	}
	static void Method4() {
		System.out.println("Method4");	
	}
	static void Method5() {
		System.out.println("Method5");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		Method1();

	}

}
