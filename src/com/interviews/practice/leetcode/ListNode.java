package com.interviews.practice.leetcode;

 public class ListNode {
    public int val;
    public ListNode next;
    
    public ListNode(int x) { val = x; }
    
	public static void print(ListNode head)
	{
		ListNode pointer = head;
		
		while(pointer != null)
		{
			if(pointer.next == null)
				System.out.print(pointer.val);
			else
				System.out.print(pointer.val+", ");
			
			pointer = pointer.next;
		}
		
		System.out.println();
	}
	
	public static void add(ListNode head, int val)
	{
		ListNode pointer = head;
		
		while(pointer.next != null)
			pointer = pointer.next;
		
		pointer.next = new ListNode(val);
	}
	
 }