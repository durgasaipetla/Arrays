package com.kodnest.arrays.level3;

import java.util.Iterator;
import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length");
		int arr[]= new int[(sc.nextInt())];
		System.out.println("enter array elements");
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++) 
		{
			arr1[i]=arr[i];
		}
		System.out.println("printing the copying elements");
		for (int copy : arr1)
		{
			System.out.print(copy+" ");
		}
	}
	}