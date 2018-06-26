package com.interviews.utils;

public class DirectedGraph extends SimpleGraphBase {

	public DirectedGraph(int vertices)
	{
		super(vertices);
		
	}

	@Override
	public void addEdge(int v, int w) {

		this.adjacenyList[v].add(w);
		
	}

	@Override
	public Iterable<Integer> adjacentTo(int v) {
		return this.adjacenyList[v];
	}
}
