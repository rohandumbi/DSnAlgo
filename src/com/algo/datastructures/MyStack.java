package com.algo.datastructures;

public class MyStack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public MyStack(int size){
		maxSize = size;
		stackArray = new long[maxSize];
		top = -1;
	}
	
	public void push(long value){//insert at top of stack
		stackArray[++top] = value;
	}
	
	public long pop(){//remove the item at the top of  stack
		return stackArray[top--];
	}
	
	public long peek(){
		return stackArray[top];
	}
	
	public boolean isFull(){
		return top == maxSize-1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
}
