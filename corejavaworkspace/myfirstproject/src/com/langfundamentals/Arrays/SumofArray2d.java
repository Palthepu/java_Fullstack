package com.langfundamentals.Arrays;

import java.util.Scanner;

public class SumofArray2d {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] arr1=new int[5];
	int[] arr2=new int[5];
	System.out.println("enter array elements");
	int sum=0;
	for(int i=0;i<arr1.length;i++) {
		arr1[i]=sc.nextInt();
	}
	System.out.println("enter array2 elements");
	for(int i=0;i<arr2.length;i++) {
		arr2[i]=sc.nextInt();
	}
	for(int i=0;i<arr1.length;i++) {
		sum=arr1[i]+arr2[i];
	    System.out.print(sum+" ");
	}
}
}