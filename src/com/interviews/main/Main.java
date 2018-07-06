package com.interviews.main;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

import com.interviews.graphs.DFSFindX;
import com.interviews.practice.geeksforgeeks.FindIslands;
import com.interviews.practice.geeksforgeeks.TransitiveClosure;
import com.interviews.utils.CompleteGraph;
import com.interviews.utils.DirectedGraph;
import com.interviews.utils.SimpleGraphBase;

public class Main {
	
	public static void main(String args[])
	{

		int[][] maze = 
		{
			{1,0,1,0,0,1,0},
			{1,1,0,0,0,1,0},
			{1,0,1,0,0,0,0},
			{1,0,0,1,0,0,0},
			{0,0,0,0,1,1,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0}

				
		};
		
		DFSFindX find = new DFSFindX();
		find.findPathToX(2, maze);
	}
	
	
}
