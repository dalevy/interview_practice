package com.interviews.utils;

public class DepthFirstSearch {
	
	boolean[] marked;
	int[] edgeTo;
	
	public DepthFirstSearch(SimpleGraphBase G, int s)
	{
		dfs(G, s);
	}
	
	private void dfs(SimpleGraphBase G, int v)
	{
		//mark the vertex as visited
		marked[v] = true;
		
		//for reach vertex that is adjacent to this vertex
		for(int w: G.adjacentTo(v))
		{
			//if it is not already marked as visited
			if(!marked[w])
			{
				//visit the neighbor recursively
				dfs(G, w);
				//after visiting it add the edge that took us to that vertex
				edgeTo[w] = v;
			}
		}
	}

}
