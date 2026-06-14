package com.langfundamentals;

public class TestDataTypes {
	//1.Create an int variable.Store it into a double variable.
	int a;
	double b=a;
	//Store integer 66.Convert it into char.
	int c=66;
	double di = 12.999;
	byte bu=(byte)di;
	//char e=c;Type mismatch: cannot convert from int to char
	char d = (char)c;
	float f = 99.99f;
	long g=(long) f;
	long i = 8000;
	short s=(short)i;
	public static void main(String[] args) {
		TestDataTypes d=new TestDataTypes();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.d);
		System.out.println(d.g);
		System.out.println(d.bu);
	}

}
