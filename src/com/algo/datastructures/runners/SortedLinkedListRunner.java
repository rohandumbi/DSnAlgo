package com.algo.datastructures.runners;

import com.algo.datastructures.SortedLinkedList;

public class SortedLinkedListRunner {

	public static void main(String[] args) {
		SortedLinkedList oSortedLinkedList = new SortedLinkedList();
		
		oSortedLinkedList.insert(20, 20);
		oSortedLinkedList.insert(10, 10);
		oSortedLinkedList.insert(40, 40);
		oSortedLinkedList.insert(30, 30);
		
		oSortedLinkedList.displayList();
	}

}
