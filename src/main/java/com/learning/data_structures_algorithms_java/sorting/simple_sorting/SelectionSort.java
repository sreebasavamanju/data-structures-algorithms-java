package com.learning.data_structures_algorithms_java.sorting.simple_sorting;

import com.learning.data_structures_algorithms_java.common.Utils;

public class SelectionSort {

	public static void main(String[] args) {

		long[] arr = new long[] { 0, 10, 5, 2, 7, 4, 9 };
		SelectionSort selectionSort = new SelectionSort();
		Utils.dispaly(selectionSort.selectionSort(arr));
	}

	private long[] selectionSort(long[] arr) {
		int out, in, min;
		for (out = 0; out < arr.length - 1; out++) {
			min = out;
			for (in = out + 1; in < arr.length; in++) {
				if (arr[in] < arr[min]) {
					min = in;
				}
			}
			Utils.swap(arr, out, min);
		}

		return arr;
	}

}
