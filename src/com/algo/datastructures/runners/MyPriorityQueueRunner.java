package com.algo.datastructures.runners;

import com.algo.datastructures.MyPriorityQueue;

public class MyPriorityQueueRunner {

	public static void main(String[] args) {
		MyPriorityQueue oMyQueue = new MyPriorityQueue(5);
		oMyQueue.insert(40);
		oMyQueue.insert(10);
		oMyQueue.insert(30);
		oMyQueue.insert(20);
		
		printQueue(oMyQueue);
		
	}
	
	public static void printQueue(MyPriorityQueue queue){
		while(!queue.isEmpty()){
			long n = queue.remove();
			System.out.println(n);
		}
	}

}
