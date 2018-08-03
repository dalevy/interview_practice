package com.interviews.practice.leetcode;

/*
 * Leet Code 104.  Top 100 Interview Questions MMaximum Depth of Binary Tree[EASY]
 */
public class E104 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int maxDepth(TreeNode root) {

		return dfs(root, 1);
	}

	private int dfs(TreeNode root, int count) {
		if (root == null)
			return count - 1;

		int left = dfs(root.left, count + 1);
		int right = dfs(root.right, count + 1);

		int max = 0;
		if (left > right)
			max = left;
		else if (right > left)
			max = right;
		else
			max = left;

		return max;
	}

}
