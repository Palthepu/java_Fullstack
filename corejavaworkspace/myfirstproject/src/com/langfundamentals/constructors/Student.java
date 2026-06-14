package com.langfundamentals.constructors;
//constructor chaining
public class Student {
	int id;
	String name;
	double marks;
	Student(){
		System.out.println("default constructor");
	}
	Student(int id){
		this();
		this.id=id;
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public static void main(String[] args) {
		Student s1=new Student(101);
		s1.display();
		Student s2=new Student(102,"meghana");
		s2.display();
		Student s3=new Student(103,"megha",100.00);
		s3.display();
	}
	void display() {
		System.out.println("id is:"+id);
		System.out.println("name is: "+name);
		System.out.println("****************************");
	}

}
