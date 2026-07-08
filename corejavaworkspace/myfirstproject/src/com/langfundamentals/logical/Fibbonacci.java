package com.langfundamentals.logical;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		System.out.println(n1+" "+n2);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int n3=n1+n2;
		n1=n2;
		n2=n3;
	}

}
