package com.langfundamentalsmethods;
class Student{
	int sno;
	String name;
	double marks;
}
public class TestMethodsDemo1 {
	Student getStudentInfo() {
		Student s=new Student();
		s.sno=12;
		s.name="abc";
		s.marks=123;
		return s;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		TestMethodsDemo1 t1=new TestMethodsDemo1();
		Student st=t1.getStudentInfo();
		System.out.println(st.sno);
		System.out.println(st.name);
		System.out.println(st.marks);
	}

}
