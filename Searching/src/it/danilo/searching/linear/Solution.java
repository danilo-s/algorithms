package it.danilo.searching.linear;

//Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].

//Input : arr[] = {10, 20, 80, 30, 60, 50, 
//        110, 100, 130, 170}
//x = 110;
//Output : 6
//Element x is present at index 6
//
//Input : arr[] = {10, 20, 80, 30, 60, 50, 
//        110, 100, 130, 170}
//x = 175;
//Output : -1
//Element x is not present in arr[].

//complexity:O(n)

public class Solution {

	public static int search(int arr[], int x) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 10;

		int result = search(arr, x);
		if (result == -1)
			System.out.print("Element is not present in array");
		else
			System.out.print("Element is present at index " + result);
	}
}
