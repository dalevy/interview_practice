package com.interviews.practice.leetcode;

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

}
