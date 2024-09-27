package com.kodnest.arrayslevel1;

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter array length");
	int arr[]= new int[(sc.nextInt())];
	System.out.println("enter array elements");
	for(int i=0;i<=arr.length-1;i++) 
	{
		arr[i]=sc.nextInt();
	}
	SumOfArrayElements sa = new SumOfArrayElements();
	int res= sa.sumArray(arr);
	System.out.println("The sum of elements in array are "+res);
}
}
