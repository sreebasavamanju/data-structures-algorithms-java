package com.learning.data_structures_algorithms_java.stack;

import java.lang.reflect.Array;

public class Stack<T> {
	
	private int maxSize;
	private T[] stackArray;
	private int top;
	
	public Stack(int size) {
		maxSize=size;
		stackArray= (T[]) new Object[size];
		top=-1;
	}
	
	public void push(T item) {
		//increment top size and insert element to array
		stackArray[++top]=item;
	}
	
	public T pop() {
		//return top of the element and decrese top count
		return  stackArray[top--];
	}
	
	public T peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (top==maxSize-1);
	}

}
