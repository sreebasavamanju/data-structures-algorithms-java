package com.learning.data_structures_algorithms_java.linkedList;

public class SinglyLinkedList<T> {

	private Node<T> head;

	public SinglyLinkedList insert(T value) {
		Node newNode = new Node<T>(value);
		newNode.next = null;

		if (this.head == null) {
			this.head = newNode;
		} else {
			Node tmp = this.head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = newNode;
		}
		return this;
	}

	public void display() {
		
		Node tmp=this.head;
		
		while(tmp!=null) {
			System.out.println(tmp.getData());
			tmp=tmp.next;
		}
	}
	
	//Delete by data, it will delete first occurrence
	public SinglyLinkedList delete(T data) {
		
		if(this.head.getData().equals(data)) {
			this.head=this.head.next;
		}else {
			
			Node current=this.head; 
			
			while(current.next!=null) {
				
				if(current.next.getData().equals(data)) {
					current.next=current.next.next;
					break;
				}
				current=current.next;
			}
			
		}
		
		return this;
	}

}
