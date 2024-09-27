package com.kodnest.arrayslevel2;
import java.util.Scanner;

public class Program3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the array length");
	int n= sc.nextInt();
	int arr[]= new int[n];
	System.out.println("enter the array contents");
	for(int i=0;i<=arr.length-1;i++) 
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("printing array contents are");
	for (int a : arr) 
	{
		if(a>0) 
		{
		System.out.print(a+" ");
		}
	}
	sc.close();
}
}
