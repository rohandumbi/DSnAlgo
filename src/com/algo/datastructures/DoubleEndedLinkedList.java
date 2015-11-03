package com.algo.datastructures;

public class DoubleEndedLinkedList extends SimpleLinkedList{
	public Link last;
	
	public DoubleEndedLinkedList(){
		first = null;
		last = null;
	}
	
	public void insertFirst(int i, double d){ //insert at the beginning of the linked list
		Link newLink = new Link(i, d);
		if(isEmpty()){
			last = newLink;
		}else{
			newLink.next = first;
		}
		first = newLink;
	}
	
	public void insertLast(int i, double d){ //insert at the end of the linked list
		Link newLink = new Link(i, d);
		if(isEmpty()){
			first = newLink;
		}else{
			last.next = newLink;
		}
		last = newLink;
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
		if(current.next == null){ //you just deleted the last item
			last = previous;
		}
		return current;
	}
	
	public Link deleteFirst(){
		Link temp = first;
		if(first.next == null){ //only 1 link in list
			last = null;
		}
		first = first.next;
		return temp;
		
	}
}
