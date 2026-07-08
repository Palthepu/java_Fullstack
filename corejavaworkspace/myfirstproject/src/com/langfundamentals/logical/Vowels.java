package com.langfundamentals.logical;


public class Vowels {

	public static void main(String[] args) {
		char ch;
		for(ch='a';ch<='z';ch++) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch+" Vowel");
			}
		}
	}

}
