package com.langfundamentals.constructors;

public class Child extends Parent{
	String name="aaa";
    void display() {
    	System.out.println("name1: "+name);
    	System.out.println("name: "+super.pname);
    }
    void show() {
    	super.info();
    }
    Child(){
    	super();
    	System.out.println("child constructor");
    }
	public static void main(String[] args) {
		System.out.println("Child class main method started");
		Child c = new Child();
		c.display();
		c.show();
	}

}
