package model;

public class Node {
	private String frase;
	Node next;
	public Node() {

	}
	public Node(String frase) {
		this.frase = frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	public String getFrase() {
		return this.frase;
	}
	public void  setNext(Node next){
		this.next=next;
	}
	public Node getNext(){
		return next;
	}
}
