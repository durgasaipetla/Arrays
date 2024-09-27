package com.kodnest.arrays.level3;

import java.util.Scanner;

public class LinearSearchApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter array length");
	int arr[]= new int[(sc.nextInt())];
	for(int i=0;i<=arr.length-1;i++) 
	{
		arr[i]=sc.nextInt();
	}
	int key = sc.nextInt();
	for(int i=0;i<=arr.length-1;i++) 
	{
		if(key==arr[i])
		{
			System.out.println("entered "+key+" key is found");
			return;
		}
	}
	System.out.println("entered "+key+" key is not found\"");
}
}
