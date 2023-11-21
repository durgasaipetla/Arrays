package com.kodnest.training.twodarray;

import java.util.Scanner;

public class ZaggedArray {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String arr[][]=new String[6][];
    arr[0]=new String [2];
    arr[1]=new String [7];
    arr[2]=new String [3];
    arr[3]=new String [2];
    arr[4]=new String [4];
    arr[5]=new String [5];
    for (int i=0; i<=arr.length-1; i++) {
    	for(int j=0; j<=arr[i].length-1; j++) {
    		 System.out.println("Enter the name of customer " +j+" of the bank "+i);
    		arr[i][j]=sc.next();
    	}
    }
    System.out.println("Array contents are");
    for (int i=0; i<=arr.length-1; i++) {
    	for(int j=0; j<=arr[i].length-1; j++) {
   
    		System.out.print( arr[i][j]+ " ");
    	}
    System.out.println();
    sc.close();
    }
	}
	}
