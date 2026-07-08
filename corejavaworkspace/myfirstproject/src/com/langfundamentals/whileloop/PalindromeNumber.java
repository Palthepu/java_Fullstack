package com.langfundamentals.whileloop;

import java.util.Scanner;

public class PalindromeNumber {
	static int getPalindrome(int n) {
		int rev=0;
		int digit;
		while(n>0) {
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println(rev);
		return rev;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	int reverse=getPalindrome(num);
	
	}

}
