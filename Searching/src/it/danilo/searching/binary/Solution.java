package it.danilo.searching.binary;

public class Solution {
	
	//Given a sorted array arr[] of n elements, write a function to search a given element x in arr[].
	
	public static int search(int arr[], int l, int r, int x) {
		
	        if (r >= l) { 
	            int mid = l + (r - l) / 2; 
	  
	            // If the element is present at the 
	            // middle itself 
	            if (arr[mid] == x) 
	                return mid; 
	  
	            // If element is smaller than mid, then 
	            // it can only be present in left subarray 
	            if (arr[mid] > x) 
	                return search(arr, l, mid - 1, x); 
	  
	            // Else the element can only be present 
	            // in right subarray 
	            return search(arr, mid + 1, r, x); 
	        } 
	  
	        // We reach here when element is not present 
	        // in array 
	        return -1; 
	    } 

	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 10;

		int result = search(arr, 0, arr.length-1, x);
		if (result == -1)
			System.out.print("Element is not present in array");
		else
			System.out.print("Element is present at index " + result);
	}

}
