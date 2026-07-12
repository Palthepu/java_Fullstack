package com.langfundamentals.Arrays;

import java.util.Scanner;

public class SumAvgOfNumbers {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of the array: ");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the array elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	int sum=0;
	int avg=0;
	int digit=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		avg=sum/n;
		}
	System.out.println(sum);
	System.out.println(avg);
	}

}
