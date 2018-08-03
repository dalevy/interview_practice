package com.interviews.main;

import java.util.*;

public class Main {

	public static void main(String args[]) {
		
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		
		System.out.println(q.size());
		q.poll();
		System.out.println(q.size());
		q.poll();
		System.out.println(q.size());
		q.poll();
		System.out.println(q.size());

		

	}
	
 

}
