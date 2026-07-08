package com.langfundamentals.logical;

import java.util.Scanner;

public class PerfectNumber {
	static void findperfect(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
				if(sum==n) {
					System.out.println(n+" Perfect number");
				}
				else {
					System.out.println("Not a perfect number");
				}
			}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		findperfect(a);;
	}

}
