package com.langfundamentals.logical;

public class TestDemo1 {

	public static void main(String[] args) {
		int a;
		int sum=0;
		int count=0;
		for(a=1;a<=10;a++) {
			sum=sum+a;
			count++;
			System.out.println(sum);
		}
		System.out.println(count);

	}
}