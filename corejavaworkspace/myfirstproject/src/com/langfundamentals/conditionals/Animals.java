package com.langfundamentals.conditionals;

import java.util.Scanner;

public class Animals {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Main menu");
		System.out.println("1->Domestic Animals");
		System.out.println("2->Wild Animals");
		System.out.println("enter your choice:");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Domestic");
			System.out.println("1->cow");
			System.out.println("2->dog");
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:System.out.println("cow");
			break;
			case 2:System.out.println("dog");
			break;
			default:System.out.println("Invalid choice");
			}
		case 2 :System.out.println("Wild Animals");
				System.out.println("1.Lion");
				System.out.println("2.Tiger");
				System.out.println("enter your choice: ");
				int choice1=sc.nextInt();
				switch (choice1){
				case 1:System.out.println("Lion");
				break;
				case 2:System.out.println("Tiger");
				break;
				default:System.out.println("Invalid choice");
				}
		}
		}
	

}
