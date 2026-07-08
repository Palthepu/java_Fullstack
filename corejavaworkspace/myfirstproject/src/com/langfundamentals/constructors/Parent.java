package com.langfundamentals.constructors;

public class Parent {
	String pname="bbbb";
	Parent(){
		System.out.println("No arg constructor");
	}
	Parent(String pname){
		this();//using this to invoke another constructor
		System.out.println("one  arg constructor");
		this.pname=pname;//using this to refer current class
	}
	void display(Parent p) {
		System.out.println("name: "+p.pname);
		
	}
	void info() {
		this.display(this);//using this to invoke current class method
		System.out.println("current class method called");//passing this as an argument to a constructor
	}
	
	
	public static void main(String[] args) {
		Parent p=new Parent("abc");
		p.info();
	}
	Parent getObject() {
	    return this;
	}
	
	
	
}

