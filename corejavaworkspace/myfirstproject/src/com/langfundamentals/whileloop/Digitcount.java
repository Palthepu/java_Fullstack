package com.langfundamentals.whileloop;

import java.util.Scanner;

public class Digitcount {
	static int getdigitcount(int n){
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
		return count;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int a=sc.nextInt();
	int c=getdigitcount(a);

	}

}
