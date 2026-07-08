package com.langfundamentals.logical;

import java.util.Scanner;

public class PrimeNum1 {
	static boolean getPrime(int n) {
		boolean status=true;
			if(n==0||n==1) {
				return false;
			}
			for(int i=0;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
		return status;
				
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(getPrime(n)) {
				System.out.print(i);
				
			}
		}
		
	}

}
