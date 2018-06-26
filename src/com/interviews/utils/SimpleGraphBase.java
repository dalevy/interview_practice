package com.interviews.utils;

import java.util.LinkedList;

public abstract class SimpleGraphBase {
	
	public LinkedList<Integer>[] adjacenyList;
	
	int vertices;
	int edges;
	
	@SuppressWarnings("unchecked")
	public SimpleGraphBase(int vertices)
	{
		adjacenyList = (LinkedList<Integer>[]) new LinkedList[vertices];
		for(int i = 0; i < adjacenyList.length; i++)
		{
			adjacenyList[i] = new LinkedList<Integer>();
		}
		this.vertices = vertices;
		
	}
	
	public int V()
	{
		return vertices;
	}
	
	public int E()
	{
		return edges;
	}
	
	public abstract void addEdge(int v, int w);
	
	public abstract Iterable<Integer> adjacentTo(int v);

	

}
