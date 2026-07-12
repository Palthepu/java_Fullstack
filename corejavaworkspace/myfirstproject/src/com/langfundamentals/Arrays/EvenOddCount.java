package com.langfundamentals.Arrays;

public class EvenOddCount {
	static boolean iseven(int n) {
		boolean status=false;
		if(n%2==0) {
			status=true;
		}
		return status;
	}
	public static void main(String[] args) {
	int[] arr= {10,1,22,33,40,51};
	int count=0;
	int ocount=0;
	for(int i=0;i<arr.length;i++) {
		if(iseven(arr[i])) {
			count++;
		}
		else {
			ocount++;
		}
	}
	System.out.println("even numbers: "+count);
	System.out.println("Odd numbers: "+ocount);
	
	}

}
