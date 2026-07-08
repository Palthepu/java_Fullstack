package com.langfundamentals.conditionals;
import java.util.Scanner;
public class TestDemoif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=20;
		int b=30;
		int c=20;
		if(a<b) {
			System.out.println("a is less than b: "+a);	
		}
		else {
			System.out.println("b is less than a: "+b);
		}
		if(a>b){
			System.out.println("a is greater than b:"+a);
		}
		else {
			System.out.println("b is greater than a:"+b);
		}
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		if (age>18) {
			System.out.println("You are eligible for voting");
		}
		else {
			System.out.println("you are not eligible for voting");
		}
		System.out.println("enter a number: ");
		int num=sc.nextInt();
		if (num>0){
			System.out.println("number is positive");
		}
		else {
			System.out.println("number is negative");
		}
		if (num%2==0) {
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd");
		}
		int marks=sc.nextInt();		
		if (marks>=35) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		if(a%5==0 && a%11==0) {
			System.out.println("given number is divisible by 5 and 11");
		}
		else {
			System.out.println("number is not divisible by 5 and 11");
		}
		if(a%3==0 && a%7==0) {
			System.out.println("given number is multiple of 3 and 7");
		}
		else {
			System.out.println("number is not divisible by 3 and 7 ");
		}
		char ch=sc.next().charAt(0);
		if (ch>='A'&&ch<='Z') {
			System.out.println("Upper case letter");
		}
		else {
			System.out.println("not an uppercase letter");
		}
		int tria=sc.nextInt();
		int trib=sc.nextInt();
		int tric=sc.nextInt();
		if(tria+trib+tric==180) {
			System.out.println("It is a valid triangle");
		}
		else {
			System.out.println("It is not a valid triangle");
		}
		if(a==b && b==c) {
			System.out.println("It is an equilateral triangle");
		}
		else {
			System.out.println("Not an Equilateral triangle");
		}
		int salary=40000;
		if(salary>50000) {
		    System.out.println("Bonus");
		}
		else {
		    System.out.println("No Bonus");
		}
		int x=5;
		if(x++ == 5) {
		    System.out.println(x);
		}
		else {
		    System.out.println(--x);
		}
		if(++x==10) {
			System.out.println(x);
		}
		else {
			System.out.println(++x);
		}
		boolean flag=false;
		if(flag) {
		    System.out.println("True");
		}
		else {
		    System.out.println("False");
		}
		int n=10;
		if(n==0) {
		    System.out.println("Zero");
		}
		else {
		    System.out.println("Not Zero");
		}
		int n1=-5;
		if(n1>=0) {
		    System.out.println("Non Negative");
		}
		else {
		    System.out.println("Negative");
		}
		int year=2024;
		if(year%4==0) {
		    System.out.println("Leap");
		}
		else {
		    System.out.println("Not Leap");
		}
		int amount=6000;
		if(amount>=5000) {
		    System.out.println("Discount");
		}
		else {
		    System.out.println("No Discount");
		}
		int a1 = 10;
		int b2 = 30;
		int c3 = 20;

		if(a1>b2 && a1>c3) {
		    System.out.println("A is largest");
		}
		else if(b2>a1 && b2>c3) {
		    System.out.println("B is largest");
		}
		else {
		    System.out.println("C is largest");
		}
		char ch2 = 'a';

		if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u' ||
		   ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U')
		{
		    System.out.println("Vowel");
		}
		else {
		    System.out.println("Consonant");
		}
	}
}
