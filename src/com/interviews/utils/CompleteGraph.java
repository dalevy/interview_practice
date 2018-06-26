package com.interviews.utils;

public class CompleteGraph extends SimpleGraphBase {
	
	//the parent, that is u -> v u is a 
	//parent of v such that edgeTo[v] = u;
	int edgeTo[]; 
			
	public CompleteGraph(int vertices) {
		super(vertices);
		edgeTo = new int[vertices];
		
		//each vertice's parent is itself initially
		for(int i = 0; i < edgeTo.length; i++)
			edgeTo[i] = i;
		

	}

	@Override
	public void addEdge(int v, int w) {

		if(v == w)
			this.adjacenyList[v].add(v);
		
		else {
			this.adjacenyList[v].add(w);
			this.adjacenyList[w].add(v);
			this.edges++;
		}


	}

	@Override
	public Iterable<Integer> adjacentTo(int v) {
		return this.adjacenyList[v];
	}
	
	/*
	public boolean hasPathTo(int s, int v)
	{
		boolean hasPath= true;
		
		//dfs will fill edgeTo array;
		boolean[] checked = new boolean[this.V()];
		
		//check all the neighbors of v since s may be a descendant of v
		hasPathDfs(v,checked);
		
		while(e)
		
		
		return hasPath;
	}
	*/
	
	/**
	 * Using DFS, check if s has a path to v
	 * @param s
	 * @param v
	 * @return
	 */
	public boolean hasPathTo(int s, int v)
	{
		boolean[] checked = new boolean[this.vertices];
		return hasPathDfs(v,s, checked);
	}
	
	private boolean hasPathDfs(int s, int v, boolean[] visited)
	{
		
		//mark that this node has been visited
		visited[s] = true;
		
		//check all the neighbors of s
		for(int w: this.adjacenyList[s])
		{
			//if not already visited
			if(!visited[w])
			{
				//recursively search w's neighbors
				if(v == w)
					return true;
				if(hasPathDfs(w,v,visited))
					return true;
				//found w through s
				edgeTo[w] = s;
			}
		}
		
		return false;
		
	}
	
	public void printAdjanceyList()
	{
		for(int i = 0; i < this.vertices; i++)
		{
			System.out.print(i+"-> { ");
			for(int w : this.adjacenyList[i])
			{
				System.out.print(w+",");
			}
			System.out.println(" }");
		}
	}

}
