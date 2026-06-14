package com.langfundamentals.constructors;
//parameterized constructor
public class BankAccount {

    long accountNo;
    String holderName;
    double balance;
    String branch;

    BankAccount() {
        accountNo = 129293330L;
        holderName = "abcd";
        balance = 2300;
        branch = "kphb";
    }

    BankAccount(long accountNo) {
        this.accountNo = accountNo;
    }

    BankAccount(String holderName) {
        this.holderName = holderName;
    }

    BankAccount(double balance) {
        this.balance = balance;
    }

    BankAccount(String branch, String holderName) {
        this.branch = branch;
        this.holderName = holderName;
    }

    BankAccount(long accountNo, String holderName) {
        this.accountNo = accountNo;
        this.holderName = holderName;
    }

    BankAccount(double balance, String branch) {
        this.balance = balance;
        this.branch = branch;
    }

    BankAccount(long accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    BankAccount(float balance) {
        this.balance = balance;
    }

    BankAccount(int accountNo) {
        this.accountNo = accountNo;
    }

    void display() {
        System.out.println("Account No : " + accountNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance    : " + balance);
        System.out.println("Branch     : " + branch);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        b1.display();

        BankAccount b2 = new BankAccount(2345468547653678L);
        b2.display();

        BankAccount b3 = new BankAccount("aaaaaaaa");
        b3.display();

        BankAccount b4 = new BankAccount(23445.90);
        b4.display();

        BankAccount b5 = new BankAccount("kphb", "bbbbbb");
        b5.display();

        BankAccount b6 = new BankAccount(345678654356L, "ccccc");
        b6.display();

        BankAccount b7 = new BankAccount(3456.89, "jntuh");
        b7.display();

        BankAccount b8 = new BankAccount(43253647587654L, "hijuju", 345.00);
        b8.display();

        BankAccount b9 = new BankAccount(2345.00f);
        b9.display();

        BankAccount b10 = new BankAccount(23456);
        b10.display();
    }
}