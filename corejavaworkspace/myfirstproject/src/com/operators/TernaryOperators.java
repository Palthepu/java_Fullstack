package com.operators;
import java.util.Scanner;
public class TernaryOperators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=23;
		int b=25;
		int x=8;
		int c=30;
		System.out.println((a>b)?a:b);
		System.out.println((a<b)?a:b);
		System.out.println((x%2==0)?"even":"odd");
		int age=17;
		System.out.println((age>=18)?"Eligible":"Noteligible");
		System.out.println((a==b)?"equal":"Notequal");
		System.out.println((a < b) ? a + b : a - b);
		System.out.println((x>0)?"Positive":"Negative");
		int max=(a>b)?a:b;
		max=(max>c)?max:c;
		System.out.println(max);
		int num=(a>0)?a:b;
		num=(b<0)?a:b;
		System.out.println(num);
		System.out.println(((a+b)>c)?a:c);
		System.out.println(((b+c)<a)?b:c);
		char  ch='A';
		System.out.println((ch >='A'&& ch <='z')?"UpperCase":"Lowercase");
		System.out.println((a > b) ? "A" :(a == b) ? "Equal":"B");
		System.out.println("Enter a number:");
		int num1=sc.nextInt();
		String divisible=(((num1%3==0)||(num1%7==0))?"Divisible":"Not divisible");
		System.out.println(divisible);
		System.out.println("enter a character:");
		char c1=sc.next().charAt(0);
		System.out.println((ch>='A'&&ch<='Z')?"Uppercase":(ch>='a'&&ch<='z')?"Lowercase":"invalid");
		System.out.println((a>b)?a:(b>c)?b:c);
	}

}
