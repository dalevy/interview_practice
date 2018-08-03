package com.interviews.utils;


/**
 * Sedgewick Coursera Princeton Algorithms and Datastructures I Bineary Search (variation)
 *
 */
public class BinarySearch {

	public boolean binarySearch(int x, int[]arr)
	{
		int lo = 0;
		int hi = arr.length-1;
		
		while(lo <= hi)
		{
			int mid = lo + (hi-lo)/2;
			
			if(x < arr[mid]) hi = mid-1;
			else if(x > arr[mid]) lo = mid+1;
			else
				return true;
		}
		
		return false;
		
	}
}
