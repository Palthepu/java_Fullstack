package com.javaintro;

public class Student5 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object destroy");
	}
	Student5 i;

	public static void main(String[] args) {
		Student5 s1 = new Student5();
		Student5 s2 = new Student5();
		Student5 s3 = new Student5();
		
		System.out.println(s1);
		s1=null;
		s2=s1;
		s3=s2;
		System.gc();
	}

}
