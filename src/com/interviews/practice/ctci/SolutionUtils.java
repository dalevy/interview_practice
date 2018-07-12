package com.interviews.practice.ctci;

public abstract class SolutionUtils {
	
	public static void printBits(long number){
		Long val = number;
		printBits(val);
	}
	
	public static void printBits(int number) {
		Integer val = number;
		printBits(val);
	}
	
	
	public static void printBits(Integer number)
	{
		int length = number.SIZE;
		Integer mask = 0x1;
		char[] arr = new char[length];
				
		for(int position = 0; position < length; position++)
		{
			char bit  = (mask & number) == 0 ? '0': '1';
			arr[(length-1)-position] = bit;
			
			mask = mask << 1;
		}
		
		System.out.print(String.valueOf(arr)+"\n");
	}
	
	public static void printBits(Long number)
	{
		int length = number.SIZE;
		long mask = 0x1;
		char[] arr = new char[length];
				
		for(int position = 0; position < length; position++)
		{
			char bit  = (mask & number) == 0 ? '0': '1';
			arr[(length-1)-position] = bit;
			
			mask = mask << 1;
		}
		
		System.out.print(String.valueOf(arr)+"\n");
	}
	
	public static void printArray(int[] matrix, String delimiter)
	{
		for(int i = 0; i < matrix.length; i++)
		{
			int val = matrix[i];
			if(i+1 != matrix.length)
				System.out.print(val+delimiter);
			else
				System.out.print(val);
		}
		System.out.println();
	}
	
	public static void printMatrix(Integer[][] matrix, String delimiter)
	{
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[0].length; c++)
			{
				Integer val = matrix[r][c];
				if(c+1 != matrix[0].length)
					System.out.print(val+delimiter);
				else
					System.out.print(val);
			}
			System.out.println();
		}
	}
	
	
	public static void printMatrix(String[][] matrix, String delimiter)
	{
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[0].length; c++)
			{
				String val = matrix[r][c];
				if(c+1 != matrix[0].length)
					System.out.print(val+delimiter);
				else
					System.out.print(val);
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(Character[][] matrix, String delimiter)
	{
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[0].length; c++)
			{
				Character val = matrix[r][c];
				if(c+1 != matrix[0].length)
					System.out.print(val+delimiter);
				else
					System.out.print(val);
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(Boolean[][] matrix, String delimiter)
	{
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[0].length; c++)
			{
				Boolean val = matrix[r][c];
				if(c+1 != matrix[0].length)
					System.out.print( ((val) ? "T": "F")+",");
				else
					System.out.print((val) ? "T": "F");
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(float[][] matrix, String delimiter)
	{
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[0].length; c++)
			{
				float val = matrix[r][c];
				if(c+1 != matrix[0].length)
					System.out.print(val+delimiter);
				else
					System.out.print(val);
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(double[][] matrix, String delimiter)
	{
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[0].length; c++)
			{
				double val = matrix[r][c];
				if(c+1 != matrix[0].length)
					System.out.print(val+delimiter);
				else
					System.out.print(val);
			}
			System.out.println();
		}
	}
	
	
	
	public static void printMatrix(int[][] matrix, String delimiter)
	{
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[0].length; c++)
			{
				int val = matrix[r][c];
				if(c+1 != matrix[0].length)
					System.out.print(val+delimiter);
				else
					System.out.print(val);
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(char[][] matrix, String delimiter)
	{
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[0].length; c++)
			{
				char val = matrix[r][c];
				if(c+1 != matrix[0].length)
					System.out.print(val+delimiter);
				else
					System.out.print(val);
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(boolean[][] matrix, String delimiter)
	{
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[0].length; c++)
			{
				boolean val = matrix[r][c];
				if(c+1 != matrix[0].length)
					System.out.print( ((val) ? "T": "F")+",");
				else
					System.out.print((val) ? "T": "F");
			}
			System.out.println();
		}
	}
	



}
