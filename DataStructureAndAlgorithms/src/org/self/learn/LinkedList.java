package org.self.learn;


public class LinkedList {
	
	private Node head;
	private int size = 0;
	
	
	public void addFront(int data) {
		 Node newHead = new Node(data, head); 
		 this.head = newHead;
		 size++;
	}
	
	public int getFront() {
		 return this.head.data ;
	}
	
	public int getLast() {
		 if(head == null) {
			 throw new IllegalStateException("Empty List"); 
		 }
		 
		 Node currentNode = head;
		 
		 while(currentNode.next != null) {
			 currentNode = currentNode.next;
		 }
		 
		 return currentNode.data;
	}
	
	public void addBack(int data) {
		 Node newNode = new Node(data, null);
		 if(head == null) {
			 head = newNode;
			 return;
		 }
		 
		 Node currentNode = head;
		 
		 while(currentNode.next != null) {
			 currentNode = currentNode.next;
		 }
		 
		 currentNode.next = newNode;
		 size++;

	}
	
	public int getSize() {
		 if(head == null) {
			 return 0;
		 }
		 
		 int i = 0;
		 Node currentNode = head;
		 
		 while(currentNode != null) {
			 i++;
			 currentNode = currentNode.next;
		 }
		 return i;
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		this.head = null;
		this.size = 0;
	}
	
	public void deleteByValue(int data) {
		if(size == 0) {
			System.out.println("Cannot find element in Empty List");
			// throw new IllegalStateException("Empty List");
			return;
		}
		
		if(head.data == data) {
			head = head.next;
			size--;
			return;
		}

		Node currentNode = head.next;
		Node previousNode = head;

		while(currentNode != null) {
			if (currentNode.data == data) {
				previousNode.next = currentNode.next;
				size--;
				break;
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		
	}
	
	@Override
	public String toString() {
		if(head == null) {
			return "Empty List";
		}
		
		StringBuilder sb = new StringBuilder();
		Node currentNode = head;
		while(currentNode != null) {
			sb.append(currentNode);
			
			currentNode = currentNode.next;
		}
		return sb.toString();
	}



	private static class Node {
		int data;
		Node next;
		
		public Node (int data, Node next) {
			this.data = data;
			this.next = next;
		}

		@Override
		public String toString() {
			return  data + " ";
		}
		
	}	
}
