package com.algo.datastructures.runners;

import com.algo.datastructures.MyStack;

public class MyStackRunner {
	private MyStack oMyStack;
	public MyStackRunner(){
		oMyStack = new MyStack(5);
	}
	public static void main(String[] args) {
		MyStackRunner oStackRunner  = new MyStackRunner();
		
		oStackRunner.pushIntoStack(3);
		oStackRunner.pushIntoStack(2);
		oStackRunner.pushIntoStack(5);
		
		oStackRunner.peekIntoStack();
		
		oStackRunner.pushIntoStack(1);
		oStackRunner.pushIntoStack(4);
		oStackRunner.pushIntoStack(0);
		
		oStackRunner.popFromStack();
		oStackRunner.pushIntoStack(0);
		oStackRunner.peekIntoStack();
	}
	
	public void pushIntoStack(long value){
		if(!oMyStack.isFull()){
			oMyStack.push(value);
		}else{
			System.out.println("Stack is full. Cannot push.");
		}
	}
	
	public void peekIntoStack(){
		if(!oMyStack.isEmpty()){
			System.out.println("Topmost element in stack: " + oMyStack.peek());
		}else{
			System.out.println("Stack is empty.");
		}
	}
	public void popFromStack(){
		if(!oMyStack.isEmpty()){
			System.out.println("Popping element from stack: " + oMyStack.pop());
		}else{
			System.out.println("Stack is empty.");
		}
	}
	
}
