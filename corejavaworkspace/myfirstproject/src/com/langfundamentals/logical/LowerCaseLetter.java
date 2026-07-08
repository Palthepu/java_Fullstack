package com.langfundamentals.logical;

import java.util.Scanner;

public class LowerCaseLetter {
	static boolean lower=false;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character");
	char ch1=sc.next().charAt(0);
	for(char i='a';i<='z';i++) {
		if(ch1==i) {
			lower=true;
			break;
		}
	}
		if(lower) {
			System.out.println("Lowercase letter");
		}else {
			System.out.println("not a lowercase");
		}
		
	}
}


