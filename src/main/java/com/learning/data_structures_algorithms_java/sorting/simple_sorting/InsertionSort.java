package com.learning.data_structures_algorithms_java.sorting.simple_sorting;

import com.learning.data_structures_algorithms_java.common.Utils;

public class InsertionSort {

	
	public static void main(String[] args) {
		
		long[] arr = new long[] { 0, 10, 5, 2, 7, 4, 9 };
		InsertionSort insertionSort = new InsertionSort();
		Utils.dispaly(insertionSort.insertionSort(arr));
	}
	
	public long[] insertionSort(long[] arr) {
		int in,out;
		for (out = 1; out < arr.length; out++) {
			long temp=arr[out];
			in=out;
			while(in > 0 && arr[in-1]>=temp) {
				arr[in]=arr[in-1];//shift item right
				--in;
			}
			arr[in]=temp;
		}
		return arr;
	}
	
}
