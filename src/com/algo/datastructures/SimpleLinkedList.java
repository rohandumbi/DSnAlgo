package com.algo.datastructures;

public class SimpleLinkedList {
	public Link first;
	
	public SimpleLinkedList(){
		first = null; //setting to null for readability
	}
	
	public void insertFirst(int i, double d){
		Link newLink = new Link(i, d);
		newLink.next = first;
		first = newLink;
	}
	
	public Link deleteFirst(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	public Link find(int iSearchKey){ //find specific link
		Link current = first;
		while(current.iData != iSearchKey){
			if(current.next == null){
				System.out.println("Could not find element");
				return null; //couldn't find
			}else{
				current = current.next;
			}
		}
		return current;
	}
	
	public Link delete(int iSearchKey){ //delete specific link
		Link current = first;
		Link previous = first;
		while(current.iData != iSearchKey) {
			if(current.next == null){
				System.out.println("Error: Could not find link to delete");
				return null; //couldn't find
			}else{
				previous = current;
				current = current.next;
			}
		}
		previous.next = current.next;
		return current;
	}
	
	public void displayList(){
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
	}
	
}
