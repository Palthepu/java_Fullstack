package com.langfundamentals.Arrays;

public class MinMaxForEach {

	public static void main(String[] args) {
	int[] arr=new int[5];
	arr[0]=17;
	arr[1]=15;
	arr[2]=34;
	arr[3]=54;
	arr[4]=32;
	
	int min=arr[0];
	int max=arr[0];
	int secondmax=arr[0];
	int secondmin=arr[0];
	for(int num:arr) {
		if(num<min) {
			secondmin=min;
			min=num;
		}
		else if(num<secondmin && num!=min) {
			secondmin=num;
		}
	}
	System.out.println("Minimum value is: "+min);
	System.out.println("Minimum value is" + secondmin);
	for(int num:arr) {
		if(num>max) {
			secondmax=max;
			max=num;
		}
		else if(num>secondmax && num!=max) {
				secondmax=num;
			}
			
		}
	System.out.println("Max value is: "+max);
	System.out.println("Maximum value is" + secondmax);
	}
}


