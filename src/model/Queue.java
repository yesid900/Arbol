package model;

public class Queue {
	private Node head;
	private Node last;

	public Queue() {
		head = last = null;
	}

	public Node getHead() {
		return head;
	}

	public Node getLast() {
		return last;
	}

	public void SetHead(Node head) {
		this.head = head;
	}

	public void SetLast(Node Last) {
		this.head = Last;
	}

	public void push(String frase) {
		Node n = new Node(frase);
		if (isEmpty()) {
			head = n;
		} else {
			last.setNext(n);
		}
		last = n;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void pop() {
		if (!isEmpty())
			head = head.getNext();
	}
}
