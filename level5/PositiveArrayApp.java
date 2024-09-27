package com.kodnest.arrays.level5;

import java.util.Iterator;
import java.util.Scanner;

public class PositiveArrayApp{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter array1 length");
	int arr1[]= new int[(sc.nextInt())];
	System.out.println("enter array elements");
	for(int i=0;i<=arr1.length-1;i++) 
	{
		arr1[i]=sc.nextInt();
	}
	PositiveArray positiveArray= new PositiveArray();
	int res[]=positiveArray.convertPositive(arr1);
	System.out.println("array contents are");
	for (int i : res) 
	{
		System.out.print(i+" ");
		
	}
}
}
