package com.interviews.utils;

import java.util.LinkedList;
import java.util.List;

/**
 * Sedgewick Coursera Princeton Algorithms and Datastructures II graph api class
 *
 */
public class Graph {
	
	List<Integer>[] adjList;
	private int vertices;
	private int edges;
	
	public Graph(int V)
	{
		adjList = (LinkedList<Integer>[]) new LinkedList[V];
		for(int v = 0; v < V; v++)
			adjList[v] = new LinkedList<Integer>();
		
		vertices = V;
	}
	
	
	public void addEdge(int v, int w)
	{
		adjList[v].add(w);
		adjList[w].add(v);
		
		edges++;
	}
	
	public int V()
	{
		return vertices;
	}
	
	public int E()
	{
		return edges;
	}
	
	public Iterable<Integer> adj(int v)
	{
		return adjList[v];
	}
	
	public static int degree(Graph G, int v)
	{
		int degree = 0;
		for(int w: G.adj(v)) degree++;
		return degree;
	}
	
	public static int maxDegree(Graph G)
	{
		int max = 0;
		for(int v = 0; v < G.V(); v++)
			if(degree(G,v) > max)
				max = degree(G, v);
		return max;
	}
	
	public static double averageDegree(Graph G)
	{
		return 2.0 * G.E() / G.V();
	}
	
	public static int numberOfSelfLoops(Graph G)
	{
		int count = 0;
		for(int v = 0; v < G.V(); v++)
			for(int w: G.adj(v))
				if(v == w) count++;
		return count/2; //each edge counted twice
	}


}
