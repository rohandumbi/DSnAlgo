package com.algo.datastructures.applications;

class CharacterStack{
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public CharacterStack(int size){
		maxSize = size;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char value){//insert at top of stack
		stackArray[++top] = value;
	}
	
	public char pop(){//remove the item at the top of  stack
		return stackArray[top--];
	}
	
	public char peek(){
		return stackArray[top];
	}
	
	public boolean isFull(){
		return top == maxSize-1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}

}
