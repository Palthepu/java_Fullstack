package com.langfundamentals.conditionals;

import java.util.Scanner;

public class ArithmaticOperators {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc= new Scanner(System.in);
		String yn=" ";
		do {
			System.out.println("enter a number: ");
			int a=sc.nextInt();
			System.out.println("enter another number:");
			int a1=sc.nextInt();
			System.out.println("Enter a symbol: ");
			String symb=sc.next();
			double result=0;
			switch(symb) {
			case "+"->  result=a+a1;
			case "-" ->	result=a-a1;
			case "*" -> result=a*a1;
			case "/" -> result=a/a1;
			case "%" ->result=a%a1;
			default ->System.out.println("Invalid symbol");
			}
			System.out.println("The resulted value is: "+result);
			System.out.println("Do you want to continue..Click Y for Yes or N for No");
		}while(yn.equalsIgnoreCase("N"));
		yn=sc.next();
	}

}
