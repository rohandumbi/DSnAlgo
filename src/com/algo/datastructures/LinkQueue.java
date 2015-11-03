package com.algo.datastructures;

public class LinkQueue {
	private DoubleEndedLinkedList queueLink;
	
	public LinkQueue(){
		queueLink = new DoubleEndedLinkedList();
	}
	
	public void insert(int i, double d){
		queueLink.insertLast(i, d);
	}
	
	public Link delete(){
		Link link = queueLink.deleteFirst();
		return link;
	}
	
	public boolean isEmpty(){
		return queueLink.isEmpty();
	}
	
	public void displayQueue(){
		queueLink.displayList();
	}
	
}
