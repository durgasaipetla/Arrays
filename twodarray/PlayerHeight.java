package com.kodnest.training.twodarray;

import java.util.Scanner;

public class PlayerHeight {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float arr[][]=new float [4][3];
		for (int i=0;i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				System.out.println("Enter the height of game" +i+" player"+j);
				arr[i][j]=sc.nextFloat();
			}
		}
		for (int i=0;i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				System.out.print(arr[i][j]+" ");
		
			}
			System.out.println();
		}
		
	}

}
