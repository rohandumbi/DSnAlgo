package com.algo.datastructures;

public class OrderedArray extends NormalArray {

	public OrderedArray(int maxSize) {
		super(maxSize);
	}
	
	public void insert(long value){ // O(n)
		int j;
		for(j=0; j<nElements; j++){//linear search
			if(a[j]>value){
				break;
			}
		}
		for(int k=nElements; k>j; k-- ){//shifting the other elements up
			a[k] = a[k-1];
		};
		a[j] = value;
		nElements++;
	}
	
	public boolean find(long searchKey){// Binary search implementation. O(log n)
		int outerLimit = nElements;
		int innerLimit  = 0;
		while(true){
			int mid = (outerLimit + innerLimit)/2;
			if(a[mid] == searchKey){
				System.out.println("Found element at index: " + mid);
				return true;
			}else if(innerLimit > outerLimit){
				System.out.println("Could not find value: " + searchKey);
			}else{
				if(a[mid]<searchKey){
					innerLimit = mid + 1;
				}else{
					outerLimit = mid - 1;
				}
			}
		}
	}

}
