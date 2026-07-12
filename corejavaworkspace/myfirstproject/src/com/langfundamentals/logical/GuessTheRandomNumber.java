package com.langfundamentals.logical;

import java.util.Random;
import java.util.Scanner;

public class GuessTheRandomNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to guess the number game");
		Random r=new Random();
		int rnum=r.nextInt(9);
		Scanner sc=new Scanner(System.in);
		int choice = 1;
		do {
			System.out.println("enter a number: ");
			int num=sc.nextInt();
			if(rnum==num) {
				System.out.println("You won the game");
				break;
			}
			else if(num>rnum){
				System.out.println("the entered number is greater than random number..  ");
			
			}
			else if(num<rnum){
				System.out.println("The entered number is very close..");
			}
		
		if(choice==3) {
				System.out.println("Better luck next time!");
			}
			else {
				System.out.println("try again");
			}
			choice++;
		}while(choice<=3);
	
	
	
	}

}
