package com.algo.datastructures.runners;

import com.algo.datastructures.MyQueue;

public class MyQueueRunner {

	public static void main(String[] args) {
		MyQueue oMyQueue = new MyQueue(5);
		oMyQueue.insert(10);
		oMyQueue.insert(20);
		oMyQueue.insert(30);
		oMyQueue.insert(40);
		
		oMyQueue.remove();
		oMyQueue.remove();
		oMyQueue.remove();
		
		oMyQueue.insert(50);
		oMyQueue.insert(60);//wrap around condition here
		oMyQueue.insert(70);
		oMyQueue.insert(80);
		
		printQueue(oMyQueue);
		
	}
	
	public static void printQueue(MyQueue queue){
		while(!queue.isEmpty()){
			long n = queue.remove();
			System.out.println(n);
		}
	}

}
