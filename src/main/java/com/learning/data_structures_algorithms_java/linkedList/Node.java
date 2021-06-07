package com.learning.data_structures_algorithms_java.linkedList;

public class Node<T> {

	private T data;
	public Node<T> next;
	
	public Node(T value) {
		this.data=value;
		this.next=null;
	}
	
	public T getData() {
		return this.data;
	}
	
}
