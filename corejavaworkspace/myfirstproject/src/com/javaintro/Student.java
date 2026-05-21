package com.javaintro;

public class Student {
	 int id ;
	 String name  ;
	 int marks ;

	static void main1() {
		Student s = new Student();
		s.id=1;
		s.name="meghana";
		s.marks=20;
		System.out.println(s.id+" "+s.name+" "+s.marks);
	}
	public static void main(String[] args) {
		main1();
		
	}

}
