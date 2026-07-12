package com.langfundamentals.Arrays;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int a=sc.nextInt();
	int[] arr=new int[a];
	System.out.println("enter array elements: ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
    System.out.println("Array in reverse order:");
    for (int i = arr.length - 1; i >= 0; i--) {
        System.out.print(arr[i] + " ");
    }
    sc.close();
	}
	}
	
