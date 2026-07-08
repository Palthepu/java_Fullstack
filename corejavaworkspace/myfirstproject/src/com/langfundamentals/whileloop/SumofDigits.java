package com.langfundamentals.whileloop;

import java.util.Scanner;

public class SumofDigits {
	static int getSumofdigits(int n) {
		int digit = 0;
		int r=0;
		int sum=0;
		while(n>0) {
			r=n%10;
			sum=sum+digit;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int sum=getSumofdigits(num);
	System.out.println("Sum of digits: "+sum);

	
	}

}
