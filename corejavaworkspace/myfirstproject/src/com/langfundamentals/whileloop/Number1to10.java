package com.langfundamentals.whileloop;

import java.util.Scanner;

public class Number1to10 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number: ");
	int num = 0;
	while(num<10) {
		num++;
		System.out.println(num);
	}
		}

}
