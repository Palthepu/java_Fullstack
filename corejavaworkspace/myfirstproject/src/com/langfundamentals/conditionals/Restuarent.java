package com.langfundamentals.conditionals;

import java.util.Scanner;

public class Restuarent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char continueChoice;
        int total = 0;

        do {
            System.out.println("\n**** Restaurant Menu ****");
            System.out.println("1. Biryani - Rs.250");
            System.out.println("2. Burger - Rs.150");
            System.out.println("3. Pizza - Rs.300");
            System.out.println("4. Ice Cream - Rs.200");
            System.out.print("Enter your choice: ");
            int itemChoice = sc.nextInt();

            String item = "";
            int price = 0;
           

            switch (itemChoice) {

                case 1 -> {
                    item = "Biryani";
                    price = 250;
                }

                case 2 -> {
                    item = "Burger";
                    price = 150;
                }

                case 3 -> {
                    item = "Pizza";
                    price = 300;
                }

                case 4 -> {
                    item = "Ice Cream";
                    price = 200;
                }

                default -> System.out.println("Invalid Choice");
            }

            System.out.println("Item : " + item);
            System.out.println("Total Price : " + price);
            total+=price;
            System.out.print("Do you want to order again? (Y/N): ");
            continueChoice = sc.next().charAt(0);

        } while (continueChoice == 'Y' || continueChoice == 'y');
        System.out.println("totalprice: "+total);
        System.out.println("Thank You! Visit Again.");
    }
}