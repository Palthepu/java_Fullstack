package com.langfundamentals.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
	int[] arr=new int[4];
	arr[0]=15;
	arr[1]=22;
	arr[2]=21;
	arr[3]=10;
	int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
			largest=arr[i];
		}
}
		System.out.println("largest: "+largest);	
	}}