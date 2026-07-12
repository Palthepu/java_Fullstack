package com.langfundamentals.Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MinMaxOfNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter array elements");
	for(int i=0;i<arr.length;i++) {
	 	arr[i]=sc.nextInt();
	}
	 	int min=arr[0];
	 	int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
			min=arr[i];
		}
		}
			System.out.println("Minimum value is: "+min);
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
		   max=arr[i];	
	}
		}
		System.out.println("Maximum value is: "+max);
	
	}
	}


