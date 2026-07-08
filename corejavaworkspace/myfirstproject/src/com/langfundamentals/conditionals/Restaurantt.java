package com.langfundamentals.conditionals;

import java.util.Scanner;
//nested switch
public class Restaurantt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char continuechoice;
        int total = 0;

        do {
        	System.out.println("Menu");
            System.out.println("1 -> Veg");
            System.out.println("2 -> Non-Veg");
            System.out.println("3 -> Beverages");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            int price = 0;

            switch (choice) {

            case 1:
                System.out.println("Veg Menu");
                System.out.println("1 -> Paneer Butter Masala");
                System.out.println("2 -> Veg Biryani");
                System.out.println("3 -> Mushroom Curry");

                int choice1 = sc.nextInt();

                switch (choice1) {
                case 1:
                    System.out.println("Paneer Butter Masala");
                    price = 250;
                    break;

                case 2:
                    System.out.println("Veg Biryani");
                    price = 300;
                    break;

                case 3:
                    System.out.println("Mushroom Curry");
                    price = 250;
                    break;

                default:
                    System.out.println("Invalid Choice");
                }
                break;

            case 2:
                System.out.println("Non-Veg Menu");
                System.out.println("1 -> Chicken Biryani");
                System.out.println("2 -> Butter Chicken");
                System.out.println("3 -> Fish Fry");

                int choice2 = sc.nextInt();

                switch (choice2) {
                case 1:
                    System.out.println("Chicken Biryani");
                    price = 350;
                    break;

                case 2:
                    System.out.println("Butter Chicken");
                    price = 250;
                    break;

                case 3:
                    System.out.println("Fish Fry");
                    price = 300;
                    break;

                default:
                    System.out.println("Invalid Choice");
                }
                break;

            case 3:
                System.out.println("Beverages");
                System.out.println("1 -> Tea");
                System.out.println("2 -> Coffee");
                System.out.println("3 -> Juice");

                int ch = sc.nextInt();

                switch (ch) {
                case 1:
                    System.out.println("Tea");
                    price = 20;
                    break;

                case 2:
                    System.out.println("Coffee");
                    price = 30;
                    break;

                case 3:
                    System.out.println("Juice");
                    price = 50;
                    break;

                default:
                    System.out.println("Invalid Choice");
                }
                break;

            default:
                System.out.println("Invalid Choice");
            }

            total += price;

            System.out.println("Item Price : " + price);
            System.out.println("Current Bill : " + total);

            System.out.print("Do you want to order again? (Y/N): ");
            continuechoice = sc.next().charAt(0);

        } while (continuechoice == 'Y' || continuechoice == 'N');

        System.out.println("Final Bill : " + total);
        System.out.println("Thank You! Visit Again.");

    }
}