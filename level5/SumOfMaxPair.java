package com.kodnest.arrays.level5;

import java.util.Scanner;
import java.util.Arrays;

public class SumOfMaxPair {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the array length");
	int arr[]=new int[sc.nextInt()];
	System.out.println("Enter the array elements");
	//Storing array elements
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	
	Arrays.sort(arr);
	int max=0;
	System.out.print("The sum of max pair is: "+(arr[arr.length-1]+arr[arr.length-2]));
//	for (int i = 0; i < arr.length; i++) {
//		 max = arr[0]+arr[1];
//		for(int j=0;j<arr.length;j++) {
//			
//			if(arr[i]+arr[j]>max) {
//				 max=arr[i]+arr[j];
//			}
//			else {
//				continue;
//			}
//		}
//		
//	}
//	//Printing the max pair
//	System.out.println("The max pair sum is: "+max);
}
}
