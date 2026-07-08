package com.langfundamentals.whileloop;

import java.util.Scanner;

public class PrimeNumber {
	static void findprime(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	findprime(num);
	}
}
