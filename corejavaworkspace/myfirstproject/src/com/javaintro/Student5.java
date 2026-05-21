package com.javaintro;

public class Student5 {
	Student5 i;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object destroy");
	}
	public static void main(String[] args) {
		Student5 s1 = new Student5();
		Student5 s2 = new Student5();
		Student5 s3 = new Student5();
		s1=null;
		s2.i=s1;
		s3.i=s2;
		
		System.gc();
	}

}
