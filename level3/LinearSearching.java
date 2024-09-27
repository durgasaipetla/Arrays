package com.kodnest.arrays.level3;

public class LinearSearching {
public int linearSearch(int arr[], int key) {
	for(int i=0;i<arr.length;i++) 
	{
		if(key==arr[i])
		{
			return i;
		}
	}
	return -1;
}
}
