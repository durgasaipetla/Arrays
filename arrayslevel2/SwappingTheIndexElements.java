package com.kodnest.arrayslevel2;
import java.util.Scanner;

public class SwappingTheIndexElements {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the array length ");
	int arr[]= new int[sc.nextInt()];
	int temp;
	System.out.println("enter the array contents");
	for(int i=0;i<=arr.length-1;i++) 
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("printing array contents before swapping");
	for (int a : arr) 
	{
		System.out.print(a+" ");
	}
	System.out.println();
	System.out.println("enter indexes to swap");
	int x=sc.nextInt();
	int y=sc.nextInt();
	temp=arr[x];
	arr[x]=arr[y];
	arr[y]=temp;
	System.out.println("printing array contents after swapping");
	for (int a : arr) 
	{
		System.out.print(a+" ");
	}

}
}
