package com.langfundamentals.logical;

import java.util.Scanner;

public class PerfectNumber1 {

    int sum = 0;
    boolean getPerfect(int n) {
        boolean status = false;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            status = true;
        }
        return status;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();

        PerfectNumber1 obj = new PerfectNumber1();

        boolean status = obj.getPerfect(a);

        if (status) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}