package com.interviews.practice.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.interviews.practice.ctci.SolutionUtils;

public class LeetCode extends SolutionUtils {

	/*
	 * Leet Code 283. Top 100 Interview Questions Move Zeroes [EASY]
	 */
	public static void moveZeroes(int[] num) {
		int l = 0;
		int c = 0;

		while (c < num.length) {
			// skip 0's
			if (num[c] == 0)
				c++;
			// swap if found non zero
			else if (num[c] != 0) {
				// if l is free swap in
				if (num[l] == 0) {
					num[l] = num[c];
					num[c] = 0;
					l++;
					c++;
				}
				// advance l
				else if (num[l] != 0) {
					l++;
					c++;
				}

			}

		}
	}

	/*
	 * Leet Code 771. Top 100 Interview Questions Jewels and Stones [EASY]
	 */
	public static int numJewelsInStones(String J, String S) {

		// create a set of jewels we want to check against
		Set<Character> jewels = new HashSet<Character>();

		for (int i = 0; i < J.length(); i++) {
			Character c = J.charAt(i);
			jewels.add(c);
		}

		int count = 0;

		for (int ii = 0; ii < S.length(); ii++) {
			Character d = S.charAt(ii);
			if (jewels.contains(d))
				count++;
		}

		return count;

	}
	
	/*
	 *  Leet Code 387. Top 100 Interview Questions First Unique Character in a String [EASY]
	 */
    public static int firstUniqChar(String s) 
    {
        //corner cases - ignroning null by definition
        if(s.length() <= 1) return 0;
        
        int[] charCount = new int[26];
        int uniqueIndex = -1;
        
        for(int i = 0; i < s.length(); i++)
        {
            char current = s.charAt(i);
            charCount[current - 'a'] = charCount[current - 'a'] + 1;
        }
        
        for(int i = 0; i < s.length(); i++)
        {
            char current = s.charAt(i);
            if(charCount[current - 'a'] == 1)
                return i;
        }
        
        
        return uniqueIndex;
        
        
        
    }
    
    /*
	 *  Leet Code 242. Top 100 Interview Questions Valid Anagram [EASY]
	 */
    public static boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        boolean isAnagram = true;
        
        char[] charsInS = s.toCharArray(); //O(n)
        char[] charsInT = t.toCharArray(); //O(n)
        
        Arrays.sort(charsInS); //O(n log n)
        Arrays.sort(charsInT); //O(n log n)
        
        for(int i = 0; i < charsInS.length; i++) //O(n)
            if(charsInS[i] != charsInT[i])
                return false;        
        
        return isAnagram;
        
        // 3n + 2n log n = O(2n log n)
    }
    
    /*
	 *  Leet Code 21. Top 100 Interview Questions Valid Anagram [EASY]
	 */
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


}
