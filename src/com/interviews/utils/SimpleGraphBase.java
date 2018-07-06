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
	
	public static void printArray(int[] matrix)
	{
		for(int i = 0; i < matrix.length; i++)
		{
			int val = matrix[i];
			if(i+1 != matrix.length)
				System.out.print(val+",");
			else
				System.out.print(val);
		}
		System.out.println();
	}
	
	
	public static void printMatrix(String[][] matrix)
	{
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[0].length; c++)
			{
				String val = matrix[r][c];
				if(c+1 != matrix.length)
					System.out.print(val+",");
				else
					System.out.print(val);
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(char[][] matrix)
	{
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[0].length; c++)
			{
				char val = matrix[r][c];
				if(c+1 != matrix.length)
					System.out.print(val+",");
				else
					System.out.print(val);
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(boolean[][] matrix)
	{
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[0].length; c++)
			{
				boolean val = matrix[r][c];
				if(c+1 != matrix.length)
					System.out.print( ((val) ? "T": "F")+",");
				else
					System.out.print((val) ? "T": "F");
			}
			System.out.println();
		}
	}
	

	

}
