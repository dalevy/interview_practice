package com.interviews.practice.leetcode;

import com.interviews.practice.ctci.SolutionUtils;

public class LeetCode extends SolutionUtils {
	
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

}
