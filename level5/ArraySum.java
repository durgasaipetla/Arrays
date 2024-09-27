package com.kodnest.arrays.level5;

public class ArraySum {
 int[] sumArray(int arr1[],int arr2[]) {
	 int arr3[]=new int [arr1.length];
		for( int i=0;i<arr3.length;i++) 
		{
			arr3[i]=arr1[i]+arr2[i];
		}
	return arr3 ;
}
}
