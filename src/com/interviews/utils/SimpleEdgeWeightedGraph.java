package com.interviews.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.interviews.practice.ctci.SolutionUtils;

public class SimpleEdgeWeightedGraph {
	
	EdgeNode[] graph;
	
	private int vertices;
	
	@SuppressWarnings("unchecked")
	public SimpleEdgeWeightedGraph(int vertices) 
	{
		graph = (EdgeNode[]) new Object[vertices];
		this.vertices = vertices;
	}
	
	public void addEdge(int v1, int v2,int cost)
	{
		EdgeNode node1 = graph[v1] == null ? new EdgeNode(v1) : graph[v1];
		EdgeNode node2 = graph[v2] == null ? new EdgeNode(v2) : graph[v2];
		
		if(graph[v1] == null)
			graph[v1] = node1;
		if(graph[v2] == null)
			graph[v2] = node2;
		
		graph[v1].addEdge(cost, node2);
		graph[v2].addEdge(cost, node1);
	}
	
	public int getCost(int v1, int v2)
	{
		return graph[v1].getCost(graph[v2]);
	}
	
	public void printGraph() {
		
	}
	
	public int V()
	{
		return this.vertices;
	}
	
	
	public class EdgeNode<T> {
		
		T val;
		
		HashMap<EdgeNode<T>, Integer> edges;
		
		
		public EdgeNode(T val)
		{
			this.val = val;
			this.edges = new HashMap<>();
		}
		
		public void addEdge(int cost, EdgeNode<T> node)
		{
			this.edges.put(node, cost);
		}
		
		public int getCost(EdgeNode node)
		{
			return edges.get(node);
		}
		
	}
	

}
