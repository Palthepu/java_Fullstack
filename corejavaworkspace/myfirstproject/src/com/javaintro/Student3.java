package com.javaintro;
//anonymous objects
public class Student3 {

	 static String name = "Megha";
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object destroy");
	}
	public static void main(String[] args) {
		new Student3();
		System.out.println(Student3.name);
		System.gc();
	}

}