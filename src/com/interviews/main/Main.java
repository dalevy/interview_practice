package com.interviews.main;

import java.util.*;
import com.interviews.graphs.DFSFindX;
import com.interviews.practice.ctci.CTCI;
import com.interviews.practice.geeksforgeeks.FindIslands;
import com.interviews.practice.geeksforgeeks.TransitiveClosure;
import com.interviews.utils.*;

public class Main {
	
	public static void main(String args[])
	{
		int[][] matrix = {
				{1 ,1 ,1 ,1 ,1},
				{1 ,0 ,1 ,1 ,0},
				{1 ,1 ,1 ,1 ,1},			
		};
		
		
	}
	
	
	public static void zeroMatrix2(int[][] mat)
	{
		boolean[][] zeros = new boolean[mat.length][mat[0].length];
		
		for(int r = 0; r < mat.length; r++)
		{
			for(int c = 0; c < mat[0].length; c++)
			{
				zeros[r][c] = mat[r][c] == 0 ? true: false;
			}
		}
		
		//zero r,c of found locations
		for(int r = 0; r < zeros.length; r++)
		{
			for(int c = 0; c < zeros[0].length; c++)
			{
				if(zeros[r][c])
				{
					for(int zr = 0; zr < zeros.length; zr++) mat[zr][c] = 0;
					for(int zc = 0; zc < zeros[0].length; zc++) mat[r][zc] = 0;
				}
			}
		}
		
	}
	
}
