package com.kodnest.arrays.level4;

import java.util.Scanner;

public class ArrayMergeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length");
		int arr1[]= new int[(sc.nextInt())];
		System.out.println("enter array elements");
		for(int i=0;i<=arr1.length-1;i++) 
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter array2 length");
		int arr2[]=new int[sc.nextInt()];
		System.out.println("enter elements of array 2");
		for(int i=0;i<=arr2.length-1;i++) 
		{
			arr2[i]=sc.nextInt();
		}
		ArrayMerge am = new ArrayMerge();
		int res[]=am.mergeArray(arr1, arr2);
		System.out.println("the merged array elements are");
		for (int merge : res) {
			System.out.print(merge+" ");
			
		}
	
	}

}
