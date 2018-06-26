package com.interviews.main;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.interviews.practice.geeksforgeeks.FindIslands;
import com.interviews.utils.CompleteGraph;
import com.interviews.utils.SimpleGraphBase;

public class Main {
	
	public static void main(String args[])
	{
		
		int M[][]=  new int[][] 
		   {{1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1}
           };
           
   		int S[][]=  new int[][] 
   			   {{1, 0, 1, 0, 0},
   	            {0, 0, 0, 0, 0},
   	            {1, 0, 0, 1, 0},
   	            {0, 0, 0, 0, 0},
   	            {1, 0, 1, 0, 1}
   	           };
           
        System.out.print("Islands : "+FindIslands.count(M));
        System.out.print("Islands : "+FindIslands.count(S));



	}
	
	
}
