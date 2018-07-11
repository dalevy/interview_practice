package com.interviews.graphs;

import java.util.Stack;

//!!!!! Given some point in the maze and only that point, can I get to another point that is on the path of that FIRST point

public class DFSFindX {
	
	class Coordinates{
		public int x;
		public int y;
		
		public Coordinates(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}
	
	//possible nx,ny values surrounding some x,y - n is neighbor adjacent to x,y
	public static final int[] searchX = { -1, -1,-1, 0, 1, 1, 1, 0};
	public static final int[] searchY = { -1,  0, 1, 1, 1, 0,-1,-1};
	
	//max neighbors of x,y in 8 directions
	public static final int MAX_N = searchX.length;
	
	public void findPathToX(int x, int [][] maze)
	{
		Stack<Coordinates> path = new Stack<Coordinates>();
		boolean[][] visited = new boolean[maze.length][maze.length];
		
		boolean found = false;
		
		/*
		for(int row = 0; row < maze.length && !found; row++)
			for(int col = 0; col < maze.length && !found; col++)
				if(!visited[row][col] && isValid(row,col,maze))
					found = dfs(row,col,x,maze,visited,path);
					*/
		for(int index = 0; index < MAX_N; index++)
		{
			//neighbor of x,y -- nx, ny
			int nx = 0 + searchX[index];
			int ny = 0 + searchY[index];
			
			if(isValid(nx,ny, maze) && !visited[nx][ny])
			{
				dfs(nx,ny,x,maze,visited,path);
			}
		}
						
				
		
		for(Coordinates c : path)
			System.out.print("("+c.x+","+c.y+"),");
		
	}
	
	public boolean dfs(int x, int y, int s, int[][] maze, boolean[][] visited, Stack<Coordinates> path)
	{
		//add current location to path
		path.push(new Coordinates(x,y)); System.out.println("pathing to : "+x+","+y);

		
		//check if this location has s
		if(maze[x][y] == s) 
		{
			System.out.println("Found s at : "+x+","+y);
			return true;
		}
		

		
		visited[x][y] = true;
		
		//check neighbors for s
		for(int index = 0; index < MAX_N; index++)
		{
			//neighbor of x,y -- nx, ny
			int nx = x + searchX[index];
			int ny = y + searchY[index];
			
			if(isValid(nx,ny,maze) && !visited[nx][ny])
			{
				System.out.println("checking : "+nx+","+ny);

				if(dfs(nx,ny, s, maze, visited, path))
				{
					System.out.println("turning from : "+x+","+y);
					return true;
				}
				else
				{
					Coordinates c = path.pop();
					System.out.println("removing : "+c.x+","+c.y);
				}
											
			}
		}
		
		return false;
		
	}
	
	private boolean isValid(int x, int y, int[][] maze)
	{
		boolean valid = true;
		
		if(x < 0 || x >= maze.length) return false;
		
		else if( y < 0 || y >=maze.length) return false;
		
		if(maze[x][y] == 0) return false;
		
		
		return valid;
	}
	
	
	

}
