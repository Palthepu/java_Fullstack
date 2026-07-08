package com.langfundamentals.conditionals;

import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Movie category-G");
		System.out.println("Movie category-P");
		System.out.println("Movie category-V");
		System.out.println("Enter the movie Category: ");
		char ch=sc.next().charAt(0);
		switch(ch) {
			case 'G':
				System.out.println("Price of the ticket is 150/-");
				break;
			case 'P':
				System.out.println("Price of the ticket is 250/-");
				break;
			case 'V':
				System.out.println("price of the ticket is 400/-");
				break;
			default:
				System.out.println("Invalid category");
		}
	}

}
