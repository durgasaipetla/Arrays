package com.kodnest.training._3D_Array;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 1D length");
			int arr[][][]=new int[scan.nextInt()][][];
			
			System.out.println("Enter 2D length for every 1D");
			for(int i=0;i<=arr.length-1;i++)
			{
			System.out.println("Enter 2D length for 1D "+i);
			arr[i]=new int[scan.nextInt()][];
			}
			
			System.out.println("Enter 3D length for every 1D and 2D");
			   for(int i=0;i<=arr.length-1;i++)
			       {
			for(int j=0;j<=arr[i].length-1;j++)
				   	{
			System.out.println("Enter 3D length for 1D "+i+"2D "+j);
			arr[i][j]=new int[scan.nextInt()];
			}
			}
			
			for (int i=0; i<=arr.length-1;i++) 
			{
				for (int j=0; j<=arr[i].length-1;j++) 
				{
					for (int k=0; k<=arr[i][j].length-1;k++) 
					{
				System.out.println("Enter the marks of school "+i +"class "+j +"student "+k);
				arr[i][j][k]=scan.nextInt();
				    }
			   }
			}
			for (int i=0; i<=arr.length-1;i++) 
			{
				for (int j=0; j<=arr[i].length-1;j++) 
				{
					for (int k=0; k<=arr[i][j].length-1;k++) 
					{
						System.out.print(arr[i][j][k]+" ");
					}
					System.out.println();
				}
				System.out.println("-------------");
			}
			scan.close();
		}
		

	}


