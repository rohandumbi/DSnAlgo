package com.algo.datastructures;

public class NormalArray {
	protected  long[] a;
	protected int nElements;
	
	public NormalArray(int  maxSize){
		a = new long[maxSize];
		nElements = 0;
	}
	
	public void insert(long value){ //O(1)
		a[nElements] = value;
		nElements++;
	}
	
	public void printElements() {
		for(int z=0; z<nElements; z++){
			System.out.println("Value at index " + z + " is " + a[z]);
		}
	}
	
	public boolean delete(long searchKey){ //O(n)
		int i;
		for(i=0; i<nElements; i++){ //linear search
			if(a[i] == searchKey) break;
		}
		if(i == nElements){
			System.out.println("Could not find value: " + searchKey);
			return false;
		}else{
			for(int k=i; k<nElements; k++){
				a[k] = a[k+1];//move elements down
			}
			nElements--;
			return true;
		}
	}
	
	public boolean find(long searchKey){//Linear search implementation. O(n)
		int i;
		for(i=0; i<nElements; i++){
			if(a[i] == searchKey) break;
		}
		if(i == nElements){
			System.out.println("Could not find value: " + searchKey);
			return false;
		}else{
			System.out.println("Found element at index: " + i);
			return true;
		}
	}
}
