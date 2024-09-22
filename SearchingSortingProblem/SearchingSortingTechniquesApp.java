package SearchingSortingProblem;

import java.util.Scanner;

public class SearchingSortingTechniquesApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Printing the array elements before sorting");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		SearchingSortingTechniques sortingTechniques= new SearchingSortingTechniques();
		System.out.println("===> For Sorting which sorting technique do you want ");
		System.out.println();
		System.out.println("1---------Insertion sort");
		System.out.println("2---------Bubble sort");
		System.out.println("3---------Selection sort");
		int a= sc.nextInt();
		switch (a)
		{
		case 1:
		{   
			System.out.println("Printing the Array Elements Using Insertion-Sort...");
			sortingTechniques.insertionSort(arr);
			for (int i : arr) {
				System.out.print(i+" ");
			}
			break;
		}
		case 2:
		{   
			System.out.println("Printing the Array Elements Using Bubble-Sort...");
			sortingTechniques.bubbleSort(arr);
			for (int i : arr) {
				System.out.print(i+" ");
			}
			break;
		}
		case 3:
		{   
			System.out.println("Printing the Array Elements Using Selection-Sort...");
			sortingTechniques.selectionSort(arr);
			for (int i : arr) {
				System.out.print(i+" ");
			}
			break;
		}
		default:
		{
			sortingTechniques.selectionSort(arr);
		}
		}
		System.out.println();
		System.out.println();
		System.out.println("Enter key to find....");
		int key =sc.nextInt();
		System.out.println();
		System.out.println("1--------> Linear search");
		System.out.println("2--------> Binary search");
		int b=sc.nextInt();
		switch (b)
		{
		case 1:
		{   
			if(sortingTechniques.linearSearch(arr,key)>0)
				{
				System.out.println("Key is Found at Index "+sortingTechniques.linearSearch(arr,key)+" after sorting ");
				}
			else {
				System.out.println("Key is Not Found");
			     }
			break;
				}
		
		case 2:
		{ 
			if(sortingTechniques.binarySearch(arr,key)>0)
		{
		System.out.println("Key is Found at index "+sortingTechniques.binarySearch(arr,key)+" after sorting ");
		}
	else {
		System.out.println("Key is Not Found");
	     }
		}
		
	}
}
}
