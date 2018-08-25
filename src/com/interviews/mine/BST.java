package com.interviews.mine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

@SuppressWarnings("rawtypes")
public class BST extends SearchTree {
	
	public TreeNode root;
	
	public BST() {}
	
	public BST(Comparable val)
	{
		TreeNode n = new TreeNode(val);
		this.root = n;
	}

	@Override
	public void add(Comparable val) {
		TreeNode n = new TreeNode(val);
		root = insert(root,n);
		
	}
	
	private TreeNode insert(TreeNode root, TreeNode n)
	{
		if(root == null) return n;
		
		//here we determine which subtree to explore
		if(n.isLessThan(root))
			root.left = insert(root.left,n);
		else if(root.isLessThan(n))
			root.right = insert(root.right,n);

		return root;
			
	}

	@Override
	public Comparable get(Comparable val) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Comparable val) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Comparable val) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int subTreeSize(Comparable val) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Comparable min() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comparable max() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int rank(Comparable val) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteMin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List inOrderTraversal() {
		List nodes = new ArrayList();
		inOrderTraversal(root,nodes);
		return nodes;
	}
	
	private void inOrderTraversal(TreeNode root, List nodes) {
		
		if(root == null) return;
		
		inOrderTraversal(root.left, nodes);
		nodes.add(root.val);
		inOrderTraversal(root.right, nodes);
	}

	@Override
	public List preOrderTraversal() {
		List nodes = new ArrayList();
		preOrderTraversal(root,nodes);
		return nodes;
	}
	
	public List levelOrderTraversal()
	{
		List nodes = new ArrayList();
		
		bfs(root,nodes);
		
		
		return nodes;
	}
	
	private void bfs(TreeNode root, List nodes)
	{
		//Tree nodes that have already been visited.
		Set<TreeNode> marked = new HashSet<TreeNode>();
		marked.add(root);
		
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
				
		while(!q.isEmpty())
		{
			TreeNode current = q.poll();
			
			if(current.left != null && !marked.contains(current.left)) {
				q.offer(current.left);
				marked.add(current.left);
			}
			
			if(current.right != null && !marked.contains(current.right)) {
				q.offer(current.right);
				marked.add(current.right);
			}
			
			nodes.add(current.val);	
			
		}
		
		
	}
	
	/**
	 * Explore the given sub tree in the order: root, left, right
	 * @param root
	 * @param nodes
	 */
	private void preOrderTraversal(TreeNode root, List nodes)
	{
		if(root == null) return;
		
		nodes.add(root.val);	
		
		preOrderTraversal(root.left,nodes); //go left
		preOrderTraversal(root.right,nodes); //go right
		
		
	}

	@Override
	public List postOrderTraversal() {
		List nodes = new ArrayList();
		postOrderTraversal(root,nodes);
		return nodes;
	}
	
	private void postOrderTraversal(TreeNode root, List nodes) {
		
		if(root == null) return;
		
		postOrderTraversal(root.left, nodes);
		postOrderTraversal(root.right,nodes);
		
		nodes.add(root.val);
		
		
	}
	
	/**
	 * A single Binary Tree Node
	 * @author dlevy022
	 *
	 * @param <T>
	 */
	@SuppressWarnings("rawtypes")
	class TreeNode<T extends Comparable> {
		
		public T val;
		public TreeNode left;
		public TreeNode right;
		
		public TreeNode() {}
		
		public TreeNode(T val)
		{
			this.val = val;
		}
		
		public boolean isLessThan(TreeNode n)
		{
			return isLessThan(val, n.val);
		}
		
		private boolean isLessThan(Comparable a, Comparable b)
		{
			return a.compareTo(b) < 0 ? true : false;
		}

		
	}

}
