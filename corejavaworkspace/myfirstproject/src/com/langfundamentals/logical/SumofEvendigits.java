package com.langfundamentals.logical;

import java.util.Scanner;

public class SumofEvendigits {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number ");
	int num=sc.nextInt();
	int count=0;
	int sum=0;
	for(int i=0;i<num;i++) {
		count++;
	}
	System.out.println(count);
	
	}

}
