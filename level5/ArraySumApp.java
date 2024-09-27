package com.kodnest.arrays.level5;

import java.util.Scanner;

public class ArraySumApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter array1 length");
	int arr1[]= new int[(sc.nextInt())];
	System.out.println("enter array elements");
	for(int i=0;i<=arr1.length-1;i++) 
	{
		arr1[i]=sc.nextInt();
	}
	int arr2[]=new int[arr1.length];
	System.out.println("enter elements of array 2");
	for(int i=0;i<=arr2.length-1;i++) 
	{
		arr2[i]=sc.nextInt();
	}
	ArraySum arraySum=new ArraySum();
	int res[]=arraySum.sumArray(arr1, arr2);
	System.out.println("Printing the arr3 values");
	for (int i : res) 
	{
		System.out.print(i+" ");
	}
}
}
