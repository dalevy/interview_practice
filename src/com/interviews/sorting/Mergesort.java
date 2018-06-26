package com.interviews.sorting;

public class Mergesort {
	
	public static void sort()
	{
		
	}
	
	private void merge(Comparable[] arr, Comparable[] aux, int lo, int mid, int hi)
	{
		//copy from the (sub) array low to hi into the auxiliary array
		for(int k = lo; k < hi; k++)
			aux[k] = arr[k];
		
		//start i at the left part, start j at the right of the midpoint
		int i = lo, j = mid+1;
		
		//iterate over the elements from low to hi
		for(int k = lo; k <= hi; k++)
		{
			if(i > mid) 					 arr[k] = aux[j++];
			else if (j > hi) 				 arr[k] = aux[i++];
			else if ( less(aux[j], aux[i]) ) arr[k] = aux[j++];
			else 							 arr[k] = aux[i++];
		}
		
	}
	
	private boolean less(Comparable a, Comparable b)
	{
		return a.compareTo(b) < 0 ? true: false;
	}

}
