package com.langfundamentals.logical;

import java.util.Scanner;

public class Largestdigit {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
    int largest = 0;

    for (; num > 0; num = num / 10) {
        int digit = num % 10;

        if (digit > largest) {
            largest = digit;
        }
    }

    System.out.println("Largest digit is: " + largest);
}
}
