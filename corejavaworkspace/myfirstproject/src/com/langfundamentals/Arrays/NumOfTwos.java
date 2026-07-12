package com.langfundamentals.Arrays;

import java.util.Scanner;

public class NumOfTwos {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	int a=sc.nextInt();
	int arr[]=new int[a];
	System.out.println("enter the elements: ");
	for(int i=0;i<a;i++) {
		arr[i]=sc.nextInt();
	}
	int count=0;
	for(int i=0;i<arr.length;i++) {
		int temp=arr[i];
		int rem=0;
		while(temp>0) {
			rem=temp%10;
			if(rem==2) {
				count++;
			}
			temp=temp/10;
		}
	
	}
	System.out.println("number of 2's in given array: "+count);
		}
}

