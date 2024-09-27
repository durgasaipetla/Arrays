package com.kodnest.arrayslevel2;
import java.util.Scanner;

public class SwapLogic {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the 2 numbers ");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int temp;
	System.out.println("Before swapping the numbers are");
	System.out.println("x= "+x+" y= "+y);
	temp=x;
	x=y;
	y=temp;
	System.out.println("After swapping the numbers are");
	System.out.println("x= "+x+" y= "+y);
}
}
