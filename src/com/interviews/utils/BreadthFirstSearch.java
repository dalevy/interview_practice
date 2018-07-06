package com.interviews.utils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Sedgewick Coursera Princeton Algorithms and Datastructures II
 *
 */
public class BreadthFirstSearch {

	private boolean[] visited;
	private int[] edgeTo;
	private final int s;
	
	public BreadthFirstSearch(SimpleGraphBase G, int s)
	{
		visited = new boolean[G.V()];
		edgeTo = new int[G.E()];
		this.s = s;
	}
	
	public void bfs(SimpleGraphBase G, int s)
	{
		//Add the source vertex to a queue
		Queue<Integer> q = new LinkedList<Integer>();
		visited[s] = true;
		
		q.add(s);
		
		//while we have not visited all the vertexes in the graph
		while(!q.isEmpty())
		{
			//remove the current vertex
			int v = q.remove();
			//visit ALL of its adjacent neighbors
			for(int w: G.adjacentTo(v))
			{
				//assuming the neighbor has not been visited, add it to the queue 
				//so its adjacent neighbors can also be visited
				if(!visited[w])
				{
					q.add(w);
					visited[w] = true;
					edgeTo[w] = v;
				}
			}
		}
		
	}
}
