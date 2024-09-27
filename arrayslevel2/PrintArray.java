package com.kodnest.arrayslevel2;

public class PrintArray {
public  void printarray(int arr[]){
	System.out.println("array elements printing in forward direction");
	for (int a : arr) 
	{
		System.out.println(a+" ");
	}
	System.out.println("array elements printing in reverse direction");
	for(int i=arr.length-1;i>=0;i--) 
	{
		System.out.print(arr[i]+" ");
	}
}
}
