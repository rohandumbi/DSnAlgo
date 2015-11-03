package com.algo.datastructures;

public class LinkStack {
	private SimpleLinkedList stackList;
	
	public LinkStack(){
		stackList = new SimpleLinkedList();
	}
	
	public void push(int i, double d){
		stackList.insertFirst(i, d);
	}
	
	public Link pop(){
		Link link = stackList.deleteFirst();
		return link;
	}
	
	public void displayStack(){
		stackList.displayList();
	}
	
	public boolean isEmpty(){
		return stackList.isEmpty();
	}
}
