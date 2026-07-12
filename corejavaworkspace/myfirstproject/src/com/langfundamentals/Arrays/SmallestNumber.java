package com.langfundamentals.Arrays;

public class SmallestNumber {

	public static void main(String[] args) {
	int smallnum[]=new int[5];
	smallnum[0]=12;
	smallnum[1]=14;
	smallnum[2]=23;
	smallnum[3]=3;
	smallnum[4]=34;
	int smallest=smallnum[0];
	for(int i=0;i<smallnum.length;i++) {
		if(smallnum[i]<smallest) {
			smallest=smallnum[i];
		}
	}
	System.out.println("smallest number is: "+smallest);
	}

}
