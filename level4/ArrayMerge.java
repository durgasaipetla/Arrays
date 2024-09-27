package com.kodnest.arrays.level4;

public class ArrayMerge {
public int[] mergeArray(int arr1[], int arr2[]) {
	int i;
	int arr3[]=new int [arr1.length+arr2.length];
	for( i=0;i<arr1.length;i++) 
	{
		arr3[i]=arr1[i];
	}
	for(int j=0;j<arr2.length;j++) 
	{
		arr3[i]=arr2[j];
		i++;
	}
	return arr3;
}
}
