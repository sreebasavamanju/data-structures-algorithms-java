package com.learning.data_structures_algorithms_java.linkedList;

public class LinkedListApp {

	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> linkedList=new SinglyLinkedList<Integer>();
		linkedList.insert(10);
		linkedList.insert(20);
		linkedList.insert(3);
		
		linkedList.delete(3);
		linkedList.display();
		
	}
}
