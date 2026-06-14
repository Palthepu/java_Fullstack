package com.langfundamentalsmethods;

public class MethodsWithArgs {
	//with arguments,no return
	public void displaybyte(byte a,byte b) {
		System.out.println(a+b);
	}
	public void displayshort(short a,short b) {
		System.out.println(a-b);
	}
	public void displayint(int a,int b) {
		System.out.println(a*b);
	}
	public void displayfloat(float a,float b) {
		System.out.println(a/b);
	}
	public void displaydouble(double a,double b) {
		System.out.println(a%b);
	}
	
	public void subByte(byte a, byte b) {
	    System.out.println(a - b);
	}

	public void mulByte(byte a, byte b) {
	    System.out.println(a * b);
	}

	public void divByte(byte a, byte b) {
	    System.out.println(a / b);
	}

	public void modByte(byte a, byte b) {
	    System.out.println(a % b);
	}

	public void addThreeBytes(byte a, byte b, byte c) {
	    System.out.println(a + b + c);
	}

	public void averageByte(byte a, byte b, byte c) {
	    System.out.println((a + b + c) / 3);
	}

	public void squareByte(byte a) {
	    System.out.println(a * a);
	}

	public void doubleByte(byte a) {
	    System.out.println(a * 2);
	}
	public void addShort(short a, short b) {
	    System.out.println(a + b);
	}

	public void subShort(short a, short b) {
	    System.out.println(a - b);
	}

	public void mulShort(short a, short b) {
	    System.out.println(a * b);
	}

	public void divShort(short a, short b) {
	    System.out.println(a / b);
	}

	public void modShort(short a, short b) {
	    System.out.println(a % b);
	}

	public void addThreeShorts(short a, short b, short c) {
	    System.out.println(a + b + c);
	}

	public void averageShort(short a, short b, short c) {
	    System.out.println((a + b + c) / 3);
	}

	public void squareShort(short a) {
	    System.out.println(a * a);
	}
	public void addInt(int a, int b) {
	    System.out.println(a + b);
	}

	public void subInt(int a, int b) {
	    System.out.println(a - b);
	}

	public void mulInt(int a, int b) {
	    System.out.println(a * b);
	}

	public void divInt(int a, int b) {
	    System.out.println(a / b);
	}

	public void modInt(int a, int b) {
	    System.out.println(a % b);
	}

	public void addThreeInts(int a, int b, int c) {
	    System.out.println(a + b + c);
	}

	public void averageInt(int a, int b, int c) {
	    System.out.println((a + b + c) / 3);
	}

	public void squareInt(int a) {
	    System.out.println(a * a);
	}

	public void addLong(long a, long b) {
	    System.out.println(a + b);
	}

	public void subLong(long a, long b) {
	    System.out.println(a - b);
	}

	public void mulLong(long a, long b) {
	    System.out.println(a * b);
	}

	public void divLong(long a, long b) {
	    System.out.println(a / b);
	}

	public void modLong(long a, long b) {
	    System.out.println(a % b);
	}

	public void addThreeLongs(long a, long b, long c) {
	    System.out.println(a + b + c);
	}

	public void averageLong(long a, long b, long c) {
	    System.out.println((a + b + c) / 3);
	}

	public void squareLong(long a) {
	    System.out.println(a * a);
	}
	public void addFloat(float a, float b) {
	    System.out.println(a + b);
	}

	public void subFloat(float a, float b) {
	    System.out.println(a - b);
	}

	public void mulFloat(float a, float b) {
	    System.out.println(a * b);
	}

	public void divFloat(float a, float b) {
	    System.out.println(a / b);
	}

	public void modFloat(float a, float b) {
	    System.out.println(a % b);
	}

	public void addThreeFloats(float a, float b, float c) {
	    System.out.println(a + b + c);
	}

	public void averageFloat(float a, float b, float c) {
	    System.out.println((a + b + c) / 3);
	}

	public void squareFloat(float a) {
	    System.out.println(a * a);
	}
	public void doubleShort(short a) {
	    System.out.println(a * 2);
	}

	public void doubleInt(int a) {
	    System.out.println(a * 2);
	}

	public void doubleLong(long a) {
	    System.out.println(a * 2);
	}

	public void doubleFloat(float a) {
	    System.out.println(a * 2);
	}

	public void squareDouble(double a) {
	    System.out.println(a * a);
	}
	public static void main(String[] args) {
		MethodsWithArgs m1=new MethodsWithArgs();
		m1.displaybyte((byte)10,(byte)20);
		m1.displayshort((short)21, (short)23);
		m1.displayint(20, 23);
		m1.displayfloat((float)23.5f, (float)25.5);
		m1.displaydouble((double)23, (double)65);
		m1.subByte((byte)50, (byte)15);
		m1.mulByte((byte)5, (byte)6);
		m1.divByte((byte)20, (byte)4);
		m1.modByte((byte)25, (byte)7);
		m1.addThreeBytes((byte)10, (byte)20, (byte)30);
		m1.averageByte((byte)10, (byte)20, (byte)30);
		m1.squareByte((byte)5);
		m1.doubleByte((byte)8);
		m1.addShort((short)100, (short)200);
		m1.subShort((short)500, (short)100);
		m1.mulShort((short)20, (short)10);
		m1.divShort((short)100, (short)5);
		m1.modShort((short)105, (short)10);
		m1.addThreeShorts((short)10, (short)20, (short)30);
		m1.averageShort((short)30, (short)60, (short)90);
		m1.squareShort((short)12);
		m1.addInt(100, 200);
		m1.subInt(500, 200);
		m1.mulInt(20, 30);
		m1.divInt(100, 4);
		m1.modInt(101, 10);
		m1.addThreeInts(10, 20, 30);
		m1.averageInt(40, 50, 60);
		m1.squareInt(12);
		m1.addLong(1000L, 2000L);
		m1.subLong(5000L, 2000L);
		m1.mulLong(100L, 20L);
		m1.divLong(1000L, 10L);
		m1.modLong(105L, 10L);
		m1.addThreeLongs(100L, 200L, 300L);
		m1.averageLong(300L, 600L, 900L);
		m1.squareLong(12L);
		m1.addFloat(10.5f, 20.5f);
		m1.subFloat(50.5f, 10.5f);
		m1.mulFloat(5.5f, 2.0f);
		m1.divFloat(25.0f, 5.0f);
		m1.modFloat(27.5f, 5.0f);
		m1.addThreeFloats(10.5f, 20.5f, 30.5f);
		m1.averageFloat(30.0f, 60.0f, 90.0f);
		m1.squareFloat(5.5f);
		m1.doubleShort((short)25);
		m1.doubleInt(50);
		m1.doubleLong(100L);
		m1.doubleFloat(12.5f);
		m1.squareDouble(8.5);
	}

}
