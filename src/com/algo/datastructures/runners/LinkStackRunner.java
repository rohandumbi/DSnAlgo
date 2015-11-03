package com.algo.datastructures.runners;

import com.algo.datastructures.LinkStack;

public class LinkStackRunner {

	public static void main(String[] args) {
		LinkStack linkStack = new LinkStack();
		linkStack.push(10, 20);
		linkStack.push(20, 30);
		linkStack.push(40, 50);
		
		System.out.print("Stack (top-->bottom):");
		linkStack.displayStack();
		
		linkStack.pop();
		
		System.out.print("Stack (top-->bottom):");
		linkStack.displayStack();
	}

}
