package com.javaintro;
//reassigning the objects
public class Student2 {
	int id;
	String name;
	int marks;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object destroy");
	}
	public static void main(String[] args) {
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		System.out.println(s1);
		s2=s1;
		System.out.println(s2);
		System.gc();
	}

}
