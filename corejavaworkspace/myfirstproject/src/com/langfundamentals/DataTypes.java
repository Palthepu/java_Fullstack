package com.langfundamentals;

public class DataTypes {
	//byte range -128 to 127
	//if out of range then we get error:Type mismatch: cannot convert from int to byte
	int a=10000;
	double b=45.78;
	byte age=(byte)128;//explicit type casting
	byte age1=22;
	short year=(short)2026789;//explicit
	int salary=12345;
	long phone=12345678903l;
	float pi=3.14f;
	double price=12000;
	char c;
	boolean boo;
	public static void main(String[] args) {
		DataTypes d1=new DataTypes();
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.age);
		System.out.println(d1.age1);
		System.out.println(d1.year);
		System.out.println(d1.salary);
		System.out.println(d1.pi);
		System.out.println(d1.price);
		System.out.println(d1.c);
		System.out.println(d1.boo);
	}

}
