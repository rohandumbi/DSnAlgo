package com.algo.algorithms;

import com.algo.datastructures.NormalArray;

class ArrayBubbleSort extends NormalArray{

	public ArrayBubbleSort(int maxSize) {
		super(maxSize);
	}
	
	public void bubbleSort(){ //O(n^2)
		int out, in;
		
		for(out=nElements-1; out>0; out--){
			for(in=0; in<out; in++){
				if(a[in]>a[in+1]){
					swap(in, in+1);
				}
			}
		}
	}
	
	public void swap(int i, int j){
		long temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

class BubbleSortTester{
	public static void main(String[] args){
		ArrayBubbleSort oArrayBubbleSort = new ArrayBubbleSort(10);
		oArrayBubbleSort.insert(5);
		oArrayBubbleSort.insert(2);
		oArrayBubbleSort.insert(3);
		oArrayBubbleSort.insert(1);
		
		oArrayBubbleSort.printElements();
		oArrayBubbleSort.bubbleSort();
		oArrayBubbleSort.printElements();
	}
}
