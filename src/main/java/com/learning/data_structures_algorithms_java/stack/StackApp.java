package com.learning.data_structures_algorithms_java.stack;

public class StackApp {
	
	public static void main(String[] args) {
		Stack<Long> stack=new Stack<Long>(10);
		
		stack.push(10l);
		stack.push(20l);
		stack.push(30l);
		stack.push(40l);
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
			System.out.print(" ");
		}
	}

}
