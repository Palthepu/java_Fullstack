package com.langfundamentals.whileloop;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	int r=0;
	int sum=0;
	int i=1;
	while(i<=num/2) {
		r=num%i;
		if(r==0) {
			System.out.println(i);
			sum=sum+i;
		}
		i++;
	}
		if(sum==num) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a perfect number");
		}
	}
	}


