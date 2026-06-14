package com.langfundamentalsmethods;

public class Studentlab {
	int studentid;
	String studentname;
	int studentmarks;
	static int count;
	
	Studentlab(){
		count++;
	}
	
	public static void main(String[] args) {
		Studentlab sl =new Studentlab();
		Studentlab s =new Studentlab();
		sl.displayWelcome();
		sl.setStudentdetails(12, "abc", 100);
		s.setStudentdetails(13, "xyz", 200);
		System.out.println("Toatlmarks: "+sl.getmarks());
		System.out.println("BonusMarks: "+sl.CalculateBonusMarks(255));
		sl.displayCollegeName();
		System.out.println(sl.displayStudentscount());
	}
	void displayWelcome() {
		System.out.println("Welcome to student management system");
	}
	void setStudentdetails(int id,String name,double marks) {
		studentid=id;
		studentname=name;
		studentmarks=(int)marks;
		System.out.println("student id is: "+studentid);
		System.out.println("Student name is: "+studentname);
		System.out.println("student marks is: "+studentmarks);
	}
	int getmarks() {
		return studentmarks;
	}
	int CalculateBonusMarks(int bonus) {
		return bonus+ studentmarks;
	}
	static void displayCollegeName() {
		System.out.println("Vcube");
	}
	static int displayStudentscount() {
		return count;
	}
}
