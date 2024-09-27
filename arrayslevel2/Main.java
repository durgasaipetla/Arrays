package com.kodnest.arrayslevel2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PrintArray pa=new PrintArray();
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the array length ");
	int arr[]= new int[sc.nextInt()];
	System.out.println("enter the array contents");
	for(int i=0;i<=arr.length-1;i++) 
	{
		arr[i]=sc.nextInt();
	}
	pa.printarray(arr);
}
}
