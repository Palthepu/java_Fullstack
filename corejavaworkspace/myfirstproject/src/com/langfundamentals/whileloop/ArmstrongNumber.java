package com.langfundamentals.whileloop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	boolean status=Armstrong(n);
	if(status) {
		System.out.println("given number is Armstrong");
	}
	else {
		System.out.println("not a armstrong number");
	}
	}
	static boolean Armstrong(int n) {
		boolean status=false;
	int count=0;
	int sum=0;
	int rem=0;
	int n1=n;
	int temp=n;
	while(n>0) {
		rem=n%10;
		n=n/10;
		count++;
	}
	while(n1>0) {
		rem=n1%10;
		n1=n1/10;
		sum=(int)(sum+Math.pow(rem, count));
	}
	if(temp==sum) {
		status=true;
	}
	return status;
	}

}
