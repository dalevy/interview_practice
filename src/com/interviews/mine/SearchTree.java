package com.interviews.mine;

import java.util.List;

public abstract class SearchTree<T extends Comparable> {
	
	public abstract void add(T val);
	
	public abstract T get(T val);
	
	public abstract void delete(T val);
	
	public abstract boolean contains(T val);
	
	public abstract boolean isEmpty();
	
	public abstract int size();
	
	public abstract int subTreeSize(T val);
	
	public abstract T min();
	
	public abstract T max();
	
	/**
	 * Number of keys less than val
	 * @param val
	 * @return
	 */
	public abstract int rank(T val);
	
	public abstract void deleteMin();
	
	public abstract void deleteMax();
	
	public abstract List<T> inOrderTraversal();
	
	public abstract List<T> preOrderTraversal();

	public abstract List<T> postOrderTraversal();
	

}
