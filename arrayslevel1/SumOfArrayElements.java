package com.kodnest.arrayslevel1;

public class SumOfArrayElements {
public  int sumArray(int arr[]) {
	int temp=0;
	for(int i=0;i<=arr.length-1;i++) 
	{
		temp =temp+arr[i];
	}
	return temp;
}
}
