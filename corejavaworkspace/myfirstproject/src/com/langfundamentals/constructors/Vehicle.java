package com.langfundamentals.constructors;
//parameterized constructor
public class Vehicle {
    String company;
    String model;
    double price;
    int mileage;
    
    Vehicle() {
        company = "Honda";
        model = "Shine";
        price = 90000;
        mileage = 60;
    }
    Vehicle(String company) {
        this.company = company;
    }
    Vehicle(double price) {
        this.price = price;
    }
    Vehicle(int mileage) {
        this.mileage = mileage;
    }
    Vehicle(String company, String model) {
        this.company = company;
        this.model = model;
    }
    Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }
    Vehicle(String model, int mileage) {
        this.model = model;
        this.mileage = mileage;
    }
    Vehicle(String company, String model, double price) {
        this.company = company;
        this.model = model;
        this.price = price;
    }
    Vehicle(String company, String model, double price, int mileage) {
        this.company = company;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
    }
    Vehicle(char type) {
        System.out.println("Vehicle Type: " + type);
    }
    void display() {
        System.out.println("Company : " + company);
        System.out.println("Model   : " + model);
        System.out.println("Price   : " + price);
        System.out.println("Mileage : " + mileage);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.display();
        Vehicle v2 = new Vehicle("Honda");
        v2.display();
        Vehicle v3 = new Vehicle(150000);
        v3.display();
        Vehicle v4 = new Vehicle(65);
        v4.display();
        Vehicle v5 = new Vehicle("Honda", "Activa");
        v5.display();
        Vehicle v6 = new Vehicle("Yamaha", 120000);
        v6.display();
        Vehicle v7 = new Vehicle("Pulsar", 55);
        v7.display();
        Vehicle v8 = new Vehicle("TVS", "Apache", 180000);
        v8.display();
        Vehicle v9 = new Vehicle("KTM", "Duke", 250000, 40);
        v9.display();
        Vehicle v10 = new Vehicle('B');
        v10.display();
    }
}