package com.interviews.practice.geeksforgeeks;


import com.interviews.utils.DirectedGraph;

public class TransitiveClosure {
	
	static boolean visited[];
	static boolean transitive[][];
			
	public static boolean[][] find(DirectedGraph g)
	{
		//init
		visited = new boolean[g.V()];
		transitive = new boolean[g.V()][g.V()];
		
		dfs(0, g);
		
		for(int v = 0; v < g.adjacenyList.length; v++)
		{
			for(int w: g.adjacentTo(v))
			{
				if(transitive[v][w])
				{
					for(int x: g.adjacentTo(w))
						transitive[v][x] = true;
				}
			}
		}
		
		return transitive;
	}
	
	private static void dfs(int s, DirectedGraph g)
	{
		visited[s] = true;
		transitive[s][s] = true;
		
		for(int w: g.adjacentTo(s))
		{
			if(!visited[w])
			{
				dfs(w,g);
			}
			transitive[s][w] = true;
		}
		
	}
	
	

}
