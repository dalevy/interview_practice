package com.interviews.main;

import java.util.*;

import javax.management.ListenerNotFoundException;

import com.interviews.mine.BST;
import com.interviews.practice.leetcode.E104.TreeNode;
import com.interviews.practice.leetcode.ListNode;
import com.interviews.utils.SimpleEdgeWeightedGraph;
import com.interviews.utils.SimpleEdgeWeightedGraph.EdgeNode;

public class Main {

	static int count = 0;

	public static void main(String args[]) {
		
		
		SimpleEdgeWeightedGraph graph = new SimpleEdgeWeightedGraph(6);
		graph.addEdge(0, 1, 6);
		graph.addEdge(0, 2, 5);
		graph.addEdge(0, 5, 20);
		graph.addEdge(2, 3, 1);
		graph.addEdge(2, 1, 2);
		graph.addEdge(1, 5, 1);
		graph.addEdge(4, 5, 1);
		graph.printGraph();
		
		
	}
	
	public static void djikstras(int start, int goal, SimpleEdgeWeightedGraph g)
	{
		PriorityQueue<EdgeNode> q = new PriorityQueue<EdgeNode>();
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;
		
		while(l1 != null || l2 != null)
		{
			if(l1 == null){
				curr.next = l2;
				break;
			}
			else if (l2 == null) {
				curr.next = l1;
				break;
			}
			else if (l1.val < l2.val) {
				curr.next = l1;
				l1 = l1.next;
				curr = curr.next;
			}
			else if (l2.val < l1.val) {
				curr.next = l2;
				l2 = l2.next;
				curr = curr.next;
			}else {
				curr.next = l1;
				l1 = l1.next;
				curr = curr.next;
			}
		}
		
		return dummy.next;
		
	}
	
    public static double myPow(double x, int n) {
    	
    	if(n == 0) return 1;
    	
    	double value = x;
    	
    	for(int i = 1; i < Math.abs(n); i++)
    	{
    		 value = value*x;
    		
    	}
    	
    	
    	if(n < 0)
    	{
        	System.out.println("value is : "+value);
    		double one = 1;
    		value = one / value;
    	}
    	return value;
    
    }



	public static void addNode(ListNode tail, ListNode node) {
		System.out.println("Adding " + node.val + " to " + tail.val);
		count++;
		if (count == 7)
			System.exit(0);

		ListNode newNode = new ListNode(node.val);

		tail.next = newNode;
		tail = tail.next;
		System.out.println("Tail is now : " + tail.val);
		node = node.next;
		System.out.println("Node is now : " + node.val);

	}

}
