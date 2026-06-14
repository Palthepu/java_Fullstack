package com.langfundamentalsmethods;

import java.util.Scanner;

public class MethodsWithArgsWithReturn {

	    void main() {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base: ");
		float b= sc.nextFloat();
		System.out.println("enter height: ");
		double h=sc.nextDouble();
		double arTriangle=getAreaOfTriangle(b,h);
		System.out.println("Area of Triangle is:"+arTriangle);
		System.out.println("enter side: ");
		int s=sc.nextInt();
		int arSquare=getAreaOfSquare(s);
		System.out.println("Area of Square:"+arSquare);
		System.out.println("enter length: ");
		double l=sc.nextDouble();
		System.out.println("enter breadth: ");
		double b1=sc.nextDouble();
		double arRectangle=getAreaOfRectangle(l,b1);
		System.out.println("Area Of Rectangle is:"+arRectangle);
		System.out.println("enter radius: ");
		double r=sc.nextDouble();
		double arCircle=getAreaOfCircle(r);
		System.out.println("Area of circle is :"+arCircle);
	}
	double getAreaOfTriangle(float base,double height) {
		double arTri=0.5*base*height;
		return arTri;
		
	}
	int getAreaOfSquare(int side) {
		int arSqre = side*side;
		return arSqre;
	}
	double getAreaOfRectangle(double length,double breadth) {
		double arRec=length*breadth;
		return arRec;
	}
	double getAreaOfCircle(double radius) {
		double arCir=Math.PI *radius*radius;
		return arCir;
	}

}
