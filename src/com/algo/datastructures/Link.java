package com.algo.datastructures;

public class Link {
	public int iData;
	public double dData;
	public Link  next;
	
	public Link(int i, double d){
		iData = i;
		dData = d;
		next = null; //not needed to be set to null explicitly, however for better readability
	}
	public void displayLink(){
		System.out.println("iData: " + iData + " dData: " + dData);
	}
}
