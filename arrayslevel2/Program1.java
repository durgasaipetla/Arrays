package com.kodnest.arrayslevel2;
import java.util.Scanner;

public class Program1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the array length");
	int n= sc.nextInt();
	int arr[]= new int[n];
	System.out.println("enter the array contents");
	for(int i=0;i<arr.length;i++) 
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("printing the array contents are");
	for(int i=0;i<arr.length;i++) 
	{
		System.out.print(arr[i]+" ");
	}
	sc.close();
}
}
