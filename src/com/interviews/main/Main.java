package com.interviews.main;

import java.util.*;
import com.interviews.graphs.DFSFindX;
import com.interviews.practice.ctci.CTCI;
import com.interviews.practice.ctci.SolutionUtils;
import com.interviews.practice.geeksforgeeks.FindIslands;
import com.interviews.practice.geeksforgeeks.TransitiveClosure;
import com.interviews.utils.*;

public class Main {
	
	public static void main(String args[])
	{
		int[][] test= {
				{0,0,1,3,9,6},
				{0,1,3,9,6,0},
				{1,3,9,6,0,0},
				{0,1,0,3,0,9},
				{1,0,0,0,0,0},
				{0,0,0,0,0,0},
				{1,2,3,4,5,6}
				
		};
		
		for(int i = 0; i < test.length; i++)
		{
			SolutionUtils.printArray(test[i], ",");
			moveZeroes(test[i]);
			SolutionUtils.printArray(test[i], ",");
			System.out.println();

		}
		
		
	}
	
	/*
	 * Leet Code 283.  Top 100 Interview Questions Move Zeroes [EASY]
	 */
	public static void moveZeroes(int[] num)
	{
		int l = 0;
		int c = 0;
		
		while(c < num.length)
		{
			//skip 0's
			if(num[c] == 0)
				c++;
			//swap if found non zero
			else if(num[c] != 0)
			{
				//if l is free swap in
				if(num[l] == 0)
				{
					num[l] = num[c];
					num[c] = 0;
					l++;
					c++;
				}
				//advance l
				else if (num[l] != 0)
				{
					l++;
					c++;
				}
					
			}
			
		}
	}
	
    public static int titleToNumber(String s) 
    {
    	if(s.length() == 1) return s.charAt(0)-64;
    	
    	int result = 1;
    	
    	for(int i = 0; i < s.length(); i++)
    	{
    		char c = s.charAt(i);
    		int cval = c - 64;
    		
    		if((i+1) == s.length())
    			result  = result + cval;
    		
    		else
    			result = result * (26 * cval);
    		
    	}
    	
    	return result;
    	
    }


	
}
