package com.interviews.practice.ctci;

import java.util.*;

public class CTCI extends SolutionUtils {
	
	/**
	 * 6th edition pg 90 problem 1.1
	 * @param s
	 * @return
	 */
	public static boolean isUnique(String s)
	{		
		boolean isUnique = true;
		
		long vector0 = 0;
		long vector1 = 0;
		
		
		for(int index = 0; index < s.length(); index++)
		{
			char c = s.charAt(index);
			int position = c - ' ';//c - 32, chars will go from space(32) to ~(126)
			
			//determine vector
			int vector = position / 64; //size of bucket -1
			
			if(vector == 0) {
				if((vector0 & 1<<position) == 0)
					vector0 |= 1<<position;
				else
					return false;
			}else {
				if((vector1 & 1<<position) == 0)
					vector1 |= 1<<position;
				else
					return false;
			}
					
				
		}
		
		return isUnique;
	}
	
	/**
	 * 6th edition pg 91 problem 1.6
	 * @param s
	 * @return
	 */
	public static String stringCompression(String s)
	{
		if(s.length() <= 1) 
			return s;
		
		StringBuilder sb = new StringBuilder();
		
		int count = 0;
	
		//initialize to first character for tracking
		char tracked = s.charAt(0);
		
		
		for(int index = 0; index < s.length(); index++)
		{
			char current = s.charAt(index);
			
			//if the current character is the same and we 
			//are not at the end of the string just count it
			if(current == tracked && index != s.length()-1)
				count++;
			else
			{
				sb.append(tracked);
				sb.append(count);
				count = 0;
				tracked = current;
				//if we have not reached the last character go back one character to maint the correct count
				if(index != s.length()-1)
					index--;
			}
			
		}
		
		String compressed = sb.toString();
		
		if(compressed.length() > s.length())
			return s;
		
		
		return compressed;
	}
	
	
	/**
	 * 6th edition pg 91 problem 1.8
	 * @param s
	 * @return
	 */
	public static void zeroMatrix(int[][] matrix)
	{		
		//we need to know if row0 or col0 should be zeroed out 
		//since they will store which other rows should be zeroed out
		boolean isRowZero0 = false;
		boolean isColZero0 = false;
		
		//check if row0 or col0 has zeros
		for(int col = 0; col < matrix[0].length; col++)
			if(matrix[0][col] == 0) isRowZero0 = true;
		
		for(int row = 0; row < matrix.length; row++)
			if(matrix[row][0] == 0) isColZero0 = true;
		
		//check all the locations to see if there are any more zeros
		for(int row = 0; row < matrix.length; row++)
		{
			for(int col = 0; col < matrix[0].length; col++)
			{
				if(matrix[row][col] == 0)
				{
					//mark the corresponding top row and left most col to show
					//that the entire thing should be 0
					matrix[0][col] = 0;
					matrix[row][0] = 0;
				}
			}
		}
		
		
		//fill in all the rows that marked
		for(int row = 1; row < matrix.length; row++)
			if(matrix[row][0] == 0)
				for(int col = 0; col < matrix[0].length; col++)
					matrix[row][col] = 0;

		
		//fill in all the columns that were marked
		for(int col = 1; col < matrix[0].length; col++)
			if(matrix[0][col] == 0)
				for(int row = 0; row < matrix.length; row++)
					matrix[row][col] = 0;

		
		//if rowZero0 or colZero0 then zero out the corresponding top and left most row/col
		if(isRowZero0) for(int col = 0; col < matrix[0].length; col ++) matrix[0][col] = 0;
		
		if(isColZero0) for(int row = 0; row < matrix.length; row++) matrix[row][0] = 0;
		
			
	}
	
	public static void rotateMatrix(int[][] matrix, int r, int c)
	{
		//base case, we've reached the end of the row or column
		if(r == matrix.length || c == matrix.length) return;
		
		//save the value on the stack frame before the recursive call;
		int value = matrix[r][c];
		
		rotateMatrix(matrix,r,c+1);
		rotateMatrix(matrix,r+1,(matrix.length-1)-c);
		
		matrix[c][(matrix.length-1)-r] = value;
	}
	
	

}
