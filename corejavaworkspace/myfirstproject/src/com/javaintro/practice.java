package com.javaintro;

public class practice {
	static int rollno=100;
	static String course="java";
	String name;
	int marks;
	static int count;
	static{
		rollno++;
		count=rollno;
		System.out.println(count);
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block");
	}
	 static void info1() {
		System.out.println("Static method1");
		details();
	}
	 static void details() {
		System.out.println("static method2");
		practice p1= new practice();
		p1.method3();
	}
	void method3(){
		System.out.println("Instance block1");
		desc();
		
	}
	void desc() {
		System.out.println("Instance block2");
		
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		practice p2 = new practice();
        p2.name = "Meghana";
        p2.marks = 120;
		System.out.println("Name : " + p2.name);
	    System.out.println("Marks : " + p2.marks);
	    System.out.println("Roll No : " + rollno);
	    System.out.println("Course : " + course);
	    info1();
		
	}

}
