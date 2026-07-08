package com.langfundamentals.whileloop;

import java.util.Scanner;
//input=1234  ---> 1+2+3+4=10-->1+0=1
public class MagicNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n=sc.nextInt();
	int rem=0;
	
	while(n>9) {
		int sum=0;
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum+=rem;
	}
	n=sum;
	System.out.println(n);
	}
	if(n==1) {
		System.out.println("magic number");
	}
	else {
		System.out.println("Not a magic number");
	}

}
}

