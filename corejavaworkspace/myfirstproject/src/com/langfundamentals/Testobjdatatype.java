package com.langfundamentals;

import java.math.BigInteger;

public class Testobjdatatype {
	public static void main(String[] args) {
		BigInteger b1=new BigInteger("7765463564536857286573");
		BigInteger b2=new BigInteger("3287346333333333637");
		BigInteger sum=b1.add(b2);
		BigInteger mul=b1.multiply(b2);
		System.out.println(mul);
		System.out.println(sum);
		
	}

}
