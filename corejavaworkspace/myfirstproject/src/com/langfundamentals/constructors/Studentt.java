package com.langfundamentals.constructors;
//constructor chaining
public class Studentt {
	int id;
	String name;
	String course;
	int marks;
	float percentage;
	
	Studentt(){
		id=10;
		name="abc";
		course="java";
	}
	Studentt(int id,String name,String course){
		System.out.println("3-Parameterized constructor called" );
		this.id=id;
		this.name=name;
		this.course=course;
	}
	Studentt(int marks){
		System.out.println("One parameterized constructor called");
		this.marks=marks;
	}
	Studentt(int marks,int id){
		System.out.println("One parameterized constructor called");
		this.id=id;
	}
	Studentt(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
	Studentt(double marks){
		this.marks=(int)marks;
	}
	Studentt(String name){
		this.name=name;
	}
	Studentt(int id,String name,String course,double marks){
		this.name=name;
		this.id=id;
		this.course=course;
		this.marks=(int)marks;
	}
	Studentt(int id,String name,double marks){
		this.id=id;
		this.name=name;
		this.marks=(int)marks;
	}
	Studentt(long percentage){
	    this.percentage=(int)percentage;
	}

	public static void main(String[] args) {
		Studentt s1 =new Studentt();
		s1.display();
		Studentt s2 = new Studentt(2,"def","html");
		s2.display();
		Studentt s3 = new Studentt(200);
		s3.display();
		Studentt s4 = new Studentt(200,20);
		s4.display();
		Studentt s5 = new Studentt("xyz");
		s5.display();
		Studentt s6 = new Studentt("hij",300);
		s6.display();
		Studentt s7 = new Studentt(60.5);
		s7.display();
		Studentt s8 = new Studentt(200);
		s8.display();
		Studentt s9=new Studentt();
		s9.display();
		Studentt s10=new Studentt(4.4);
		s10.display();
	}
	
	void display() {
		System.out.println("Student id is: "+id);
		System.out.println("student name is: "+name);
		System.out.println("course is: "+course);
		System.out.println("Marks: "+marks);
		System.out.println("Mobile number: "+percentage);
        System.out.println("----------------------------");

	}
}
