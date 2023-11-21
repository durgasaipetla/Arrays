package com.kodnest.training.twodarray;

import java.util.Scanner;

public class GamesArray {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the no of games");
    int arr[][]=new int [sc.nextInt()][];
    
    for(int i=0;i<=arr.length-1;i++) {
    System.out.println("Enter the no of players in game "+i);
    arr[i]=new int[sc.nextInt()];
	}
    for (int i=0; i<=arr.length-1;i++) {
	for (int j=0;j<=arr[i].length-1;j++) {
		System.out.println("Enter the score of player "+j+" game "+i);
		arr[i][j]=sc.nextInt();
		}
    }
    System.out.println("The array contents are");
    for (int i=0; i<=arr.length-1;i++) {
    	for (int j=0;j<=arr[i].length-1;j++) {
    		System.out.print( arr[i][j]+ " ");
    		
    	}
    	System.out.println();
    }
    
}
}
