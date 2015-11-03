package com.algo.datastructures.runners;

import com.algo.datastructures.DoubleEndedLinkedList;
import com.algo.datastructures.Link;
import com.algo.datastructures.SimpleLinkedList;

public class DoubleEndedLinkedListRunner {

	public static void main(String[] args) {
		DoubleEndedLinkedList oDoubleEndedLinkedList = new DoubleEndedLinkedList();
		oDoubleEndedLinkedList.insertFirst(1, 2);
		oDoubleEndedLinkedList.insertFirst(5, 6);
		oDoubleEndedLinkedList.insertFirst(3, 4);
		oDoubleEndedLinkedList.insertFirst(10, 11);
		
		oDoubleEndedLinkedList.insertLast(20,21);
		oDoubleEndedLinkedList.insertLast(22,23);
		
		oDoubleEndedLinkedList.displayList();
		System.out.println("---------------------");
		oDoubleEndedLinkedList.deleteFirst();
		oDoubleEndedLinkedList.displayList();
		System.out.println("---------------------");
		oDoubleEndedLinkedList.delete(22);
		oDoubleEndedLinkedList.displayList();
		System.out.println("---------------------");
		
		Link foundLink = oDoubleEndedLinkedList.find(5);
		foundLink.displayLink();
		System.out.println("---------------------");
		
		oDoubleEndedLinkedList.first.displayLink();
		oDoubleEndedLinkedList.last.displayLink();
		
	}

}
