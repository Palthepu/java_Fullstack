package com.langfundamentals.whileloop;

import java.util.Scanner;

public class MtoNnumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a starting range M value: ");
	int M=sc.nextInt();
	System.out.println("Enter a ending range N value: ");
	int N=sc.nextInt();
	while(M<N) {
		System.out.println(M);
		M++;
	}
	}

}
