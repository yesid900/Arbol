package model;

import javax.swing.JSpinner.ListEditor;

public class Stack {
	Node head;

	public Stack() {
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getHead() {
		
		return head;
	}
	public void push(String frase) {
		Node n = new Node(frase);
		if(!isEnpty()) {
			n.setNext(head);
		}
		head = n;
	}
	public void pop () {
		head = head.next;
	}
	public boolean isEnpty() {
		
		return (head==null);
		
	}
	
}
