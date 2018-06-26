package com.interviews.main;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.interviews.practice.geeksforgeeks.FindIslands;
import com.interviews.practice.geeksforgeeks.TransitiveClosure;
import com.interviews.utils.CompleteGraph;
import com.interviews.utils.DirectedGraph;
import com.interviews.utils.SimpleGraphBase;

public class Main {
	
	public static void main(String args[])
	{

		DirectedGraph g = new DirectedGraph(5);
		g.addEdge(0, 1);
	    g.addEdge(0, 3);
	    g.addEdge(3, 2);
	    g.addEdge(2, 4);
	    g.addEdge(2, 0);
	    
	   SimpleGraphBase.printMatrix(TransitiveClosure.find(g));

	}
	
	
}
