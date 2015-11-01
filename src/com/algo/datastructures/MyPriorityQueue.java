package com.algo.datastructures;

public class MyPriorityQueue {
	private int maxSize;
	private int nItems;
	private long[] queueArray;
	
	public MyPriorityQueue(int s){
		maxSize = s;
		nItems = 0;
		queueArray = new long[maxSize];
	}
	
	public void insert(long value){
		int j,k;
		if(nItems == 0){ //empty queue
			queueArray[nItems++] = value;
		}else if(isFull()){
			System.out.println("Error: Cannot insert, queue is full");
			
		}else{ 
			//higher  priority(here value) closer to the right of the queue array
			for(j=0; j<nItems; j++){
				if(queueArray[j] > value){
					break;
				}
			}
			for(k=nItems; k>j; k-- ){//shifting the other elements up
				queueArray[k] = queueArray[k-1];
			};
			queueArray[j] = value;
			nItems++;
			
			//higher  priority(here value) closer to the left of the queue array
			/*for(j=0; j<nItems; j++){
				if(queueArray[j] < value){
					break;
				}
			}
			
			for(k=nItems; k>j; k-- ){//shifting the other elements up
				queueArray[k] = queueArray[k-1];
			};
			queueArray[j] = value;
			nItems++;*/
			
		}
	}
	
	public long remove(){//removes highest value
		return queueArray[--nItems];
	}
	
	public long peek(){
		return queueArray[nItems - 1];
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
