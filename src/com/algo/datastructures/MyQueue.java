package com.algo.datastructures;

public class MyQueue {
	private int front;
	private int rear;
	private int nItems;
	private long[] queueArray;
	private int maxSize;
	
	public MyQueue(int s){
		maxSize = s;
		queueArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(long value){
		if(!isFull()){
			if(rear == (maxSize-1)){//wrap condition
				rear = -1;
			}
			queueArray[++rear] = value;
			nItems++;
		}else{
			System.out.println("Error: Cannot insert item because queue is full");
		}
	}
	
	public long remove(){
		long item = queueArray[front++];
		if(front == maxSize){
			front = 0;
		}
		nItems--;
		return item;
	}
	
	public long peekFront(){
		return queueArray[front];
	}
	
	public boolean isEmpty(){
		return (nItems == 0);
	}
	
	public boolean isFull(){
		return (nItems == maxSize);
	}
	
	public int size(){
		return nItems;
	}
}
