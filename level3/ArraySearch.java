package com.kodnest.arrays.level3;

import java.util.Scanner;

public class ArraySearch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter array length");
	int arr[]= new int[(sc.nextInt())];
	System.out.println("enter the elements in array");
	for(int i=0;i<=arr.length-1;i++) 
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("enter target to be found ");
	int target = sc.nextInt();
	Search search= new Search();
	boolean res =search.isPresent(arr,target);
	if(res)
	{
		System.out.println("Target is present in array");
	}
	else 
	{
		System.out.println("Target is not present in array");
	}
	
}
}
