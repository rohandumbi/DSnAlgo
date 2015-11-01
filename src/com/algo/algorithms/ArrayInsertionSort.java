package com.algo.algorithms;

import com.algo.datastructures.NormalArray;

class ArrayInsertionSort extends NormalArray {

	public ArrayInsertionSort(int maxSize) {
		super(maxSize);
	}
	
	public void insertionSort(){ //O(n^2)
		int in,out;
		long temp;
		for(out=1;out<nElements;out++){
			temp = a[out];//remove element
			in = out;//start shift at out
			while(in>0 && a[in-1]>temp){
				a[in] = a[in-1];//shift items smaller than temp to right of temp
				in--;
			}
			a[in] = temp;
		}
	}

}
class InsertionSortTester{
	public static void main(String[] args){
		ArrayInsertionSort oArrayInsertionSort = new ArrayInsertionSort(10);
		oArrayInsertionSort.insert(5);
		oArrayInsertionSort.insert(2);
		oArrayInsertionSort.insert(3);
		oArrayInsertionSort.insert(1);
		
		oArrayInsertionSort.printElements();
		oArrayInsertionSort.insertionSort();
		oArrayInsertionSort.printElements();
	}
}