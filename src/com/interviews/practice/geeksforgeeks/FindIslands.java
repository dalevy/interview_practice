package com.interviews.practice.geeksforgeeks;

public class FindIslands {
	
	static int[][] map;
	static boolean [][] visited;
	static int[] nRow = {-1,-1,-1,0,0,1,1,1}; //static map representation of the 8 possible x coorinates values surrounding some x,y
	static int[] nCol = {-1,0,1,-1,1,-1,0,1};//static map representation of the 8 possible y coorinates values surrounding some x,y
	
	public static int count(int[][] matrix)
	{
		int count = 0;
		map = matrix;
		
		//visited parts of the map
		visited = new boolean[map.length][map.length];
		
		//each dfs call in this loop will mark a part(s) of the map as visited or not visited
		//and each dfs counts as one connected component with the private dfs function exploring that connectivity
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c= 0; c < matrix.length; c++)
			{
				//check if the coordinate has been visited
				if(!visited[r][c] && isValid(r,c))
				{
					System.out.println(" DFS("+r+","+c+")");
					dfs(r,c);
					count++;
					
				}
				//the coordinate has not been visited but it is not a connected component
				else if(!visited[r][c] && map[r][c] == 0) {
					visited[r][c] = true;
				}
			}
		}
		
		return count;
	}
	
	private static void dfs(int x, int y)
	{
		visited[x][y] = true;
		
		for(int i = 0; i < nRow.length; i++)
		{
			
			System.out.println((x+nRow[i])+","+(y+nCol[i]));
			if(isValid(x+nRow[i],y+nCol[i]) && !visited[x+nRow[i]][y+nCol[i]])
			{
				dfs(x+nRow[i],y+nCol[i]);
			}
		}
	}
	
	private static boolean isValid(int x, int y)
	{
		if(x < 0 || y < 0 || x > map.length-1 || y > map.length-1) return false; //array bounds x, y
		else if(map[x][y] == 0) return false; //is a valid space
		
		
		return true;
	}

}
