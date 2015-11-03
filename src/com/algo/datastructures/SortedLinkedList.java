package com.algo.datastructures;

public class SortedLinkedList extends SimpleLinkedList{
	public void insert(int i, double d){
		Link newLink = new Link(i, d);
		Link previous = null;
		Link current = first;
		
		while((current != null) && (i > current.iData)){ //not the 1st element and found the right location or reached last element
			previous = current;
			current = current.next;
		}
		if(previous == null){ //meaning array is basically empty
			first = newLink;
		}else{
			previous.next = newLink;
		}
		newLink.next = current;
	}
}
