package com.algo.datastructures.runners;

import com.algo.datastructures.Link;
import com.algo.datastructures.SimpleLinkedList;

public class SimpleLinkedListRunner {

	public static void main(String[] args) {
		SimpleLinkedList oSimpleLinkedList = new SimpleLinkedList();
		oSimpleLinkedList.insertFirst(1, 2);
		oSimpleLinkedList.insertFirst(5, 6);
		oSimpleLinkedList.insertFirst(3, 4);
		oSimpleLinkedList.insertFirst(10, 11);
		
		oSimpleLinkedList.displayList();
		System.out.println("---------------------");
		oSimpleLinkedList.deleteFirst();
		oSimpleLinkedList.displayList();
		System.out.println("---------------------");
		oSimpleLinkedList.delete(5);
		oSimpleLinkedList.displayList();
		System.out.println("---------------------");
		
		Link foundLink = oSimpleLinkedList.find(3);
		foundLink.displayLink();
		
	}

}
