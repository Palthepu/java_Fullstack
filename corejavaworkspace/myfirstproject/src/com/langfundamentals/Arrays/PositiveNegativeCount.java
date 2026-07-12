package com.langfundamentals.Arrays;

import java.util.Scanner;

public class PositiveNegativeCount {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int num=sc.nextInt();
	int arr[]=new int[num];
	System.out.println("Enter array elements");
	int positive=0;
	int negative=0;
	int zero=0;
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		if(arr[i]>0) {
			positive++;
			System.out.println(positive);
		}else if(arr[i]<0) {
			negative++;
			System.out.println(negative);
		}else {
			zero++;
		}
	}
	
	}
}

