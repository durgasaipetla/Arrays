package com.kodnest.arrays.level3;

import java.util.Scanner;

public class LinearSearchingApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter array length");
	int arr[]= new int[(sc.nextInt())];
	System.out.println("enter array elements");
	for(int i=0;i<=arr.length-1;i++) 
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("enter key to be found ");
	int key = sc.nextInt();
	LinearSearching ls = new LinearSearching();
	int res = ls.linearSearch(arr, key);
	if(res>=0) 
	{
		System.out.println("the key "+key+" is found");
	}
	else 
	{
		System.out.println("the key element is not found");
	}
	}
}
