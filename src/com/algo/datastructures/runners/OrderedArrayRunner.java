package com.algo.datastructures.runners;

import com.algo.datastructures.OrderedArray;

public class OrderedArrayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderedArray orderedArray = new OrderedArray(10);
		orderedArray.insert(5);
		orderedArray.insert(2);
		orderedArray.insert(3);
		orderedArray.insert(1);
		
		orderedArray.printElements();
		orderedArray.find(2);
	}
}
