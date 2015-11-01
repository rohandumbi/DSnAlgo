package com.algo.algorithms;

import com.algo.datastructures.NormalArray;

class ArraySelectionSort extends NormalArray{

	public ArraySelectionSort(int maxSize) {
		super(maxSize);
	}
	
	public void selectionSort(){
		int in, out, min;
		for(out=0; out<nElements-1; out++){
			min=out;
			for(in=out+1; in<nElements; in++){
				if(a[in]< a[min]){
					min=in;
				}
			}
			swap(out, min);
		}
	}
	
	public void swap(int i, int j){
		long temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}

class SelectionSortTester{
	public static void main(String[] args){
		ArraySelectionSort oArraySelectionSort = new ArraySelectionSort(10);
		oArraySelectionSort.insert(5);
		oArraySelectionSort.insert(2);
		oArraySelectionSort.insert(3);
		oArraySelectionSort.insert(1);
		
		oArraySelectionSort.printElements();
		oArraySelectionSort.selectionSort();
		oArraySelectionSort.printElements();
	}
}
