package com.langfundamentals.whileloop;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=1;
	while(count<=5) {
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		if(num%2==0) {
			count++;
		}
	}
	}
	}


