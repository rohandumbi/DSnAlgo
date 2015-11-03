package com.algo.datastructures.runners;

import com.algo.datastructures.LinkQueue;

public class LinkQueueRunner {

	public static void main(String[] args) {
		LinkQueue linkQueue = new LinkQueue();
		linkQueue.insert(10, 20);
		linkQueue.insert(30, 40);
		linkQueue.insert(50, 60);
		
		System.out.print("Queue (front-->rear): ");
		linkQueue.displayQueue();
		linkQueue.delete();
		System.out.print("Queue (front-->rear): ");
		linkQueue.displayQueue();
	}

}
