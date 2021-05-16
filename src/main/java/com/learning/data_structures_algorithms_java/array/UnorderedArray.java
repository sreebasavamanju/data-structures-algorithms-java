package com.learning.data_structures_algorithms_java.array;

public class UnorderedArray {

	private long[] a;
	private int nElems;

	public UnorderedArray(int max) {
		a = new long[max];
		nElems = 0;
	}

	public int size() {
		return nElems;
	}
	
	//Find the element in an array
	public boolean find(long searchKey) {
		int j = search(searchKey);

		if (j == nElems) {
			return false;
		} else {
			return true;
		}
	}
	
	public void insert(long value) {
		a[nElems]=value;
		nElems++;
	}
	
	public boolean delete(long valueToDelete) {
		int j = this.search(valueToDelete);
		if (j == nElems) {
			return false;
		} else {
			for (int k = j; k < nElems; k++) {
				a[k]=a[k+1];
			}
			nElems--;
			return true;
		}
	}
	
	public void display() {
		for (int j = 0; j < nElems; j++) {
			System.out.print(a[j]+ " ");
		}
		System.out.println("");
	}
	

	private int search(long searchKey) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (a[j] == searchKey) {
				break;
			}
		}
		return j;
	}
}
