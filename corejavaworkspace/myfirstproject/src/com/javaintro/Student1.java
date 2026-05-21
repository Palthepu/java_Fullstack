package com.javaintro;
//nullifying objects
public class Student1 {
	int id;
	String name;
	int marks;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object destroy");
	}
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		System.out.println(s1);
		s1=null;
		System.out.println(s1);
		System.gc();
	}

}
