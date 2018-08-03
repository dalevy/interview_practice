package com.interviews.utils;

/**
 * Sedgewick Coursera Princeton Algorithms and Datastructures I Merge Sort
 *
 */
public class MergeSort {
	
	public static void sort(Comparable[] arr)
	{
		//need aux array for copy and merge
		Comparable[] aux = new Comparable[arr.length];
		sort(arr,aux,0, arr.length-1);
	}

	private static void sort(Comparable[] arr, Comparable[] aux, int lo, int hi) 
	{
		//determine if there is overlap or a singleton array
		if(hi <= lo ) return;
		
		int mid = lo + (hi - lo) /2;
				
		//sort left sub array
		sort(arr,aux,lo,mid);
		//sort right sub array
		sort(arr,aux,mid+1,hi);
		//merge both left and right sub arrays
		merge(arr, aux, lo,mid,hi);
	}

	private static void merge(Comparable[] arr, Comparable[] aux, int lo, int mid, int hi) {
		// copy array to auxiliary array
		for (int i = lo; i <= hi; i++)
			aux[i] = arr[i];

		int i = lo;
		int j = mid + 1;

		for (int k = lo; k <= hi; k++) {
			// finished all the i's so eat all the j's
			if (i > mid)
				arr[k] = aux[j++];
			// finished all the j's so eat all the i's
			else if (j > hi)
				arr[k] = aux[i++];
			// i < j
			else if (less(aux[i], aux[j]))
				arr[k] = aux[i++];
			// j < i
			else if (less(aux[j], aux[i]))
				arr[k] = aux[j++];
			// equivalent
			else
				arr[k] = aux[i++];
		}
	}
	
	private static boolean less(Comparable a, Comparable b)
	{
		boolean isLess = a.compareTo(b) < 0 ? true: false;
		return isLess;
	}
}
