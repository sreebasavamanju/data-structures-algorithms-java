package com.learning.data_structures_algorithms_java.sorting.simple_sorting;

import com.learning.data_structures_algorithms_java.common.Utils;

public class BubbleSort {

	public static void main(String[] args) {

		long[] arr = new long[] { 0, 10, 5, 2, 7, 4, 9 };
		BubbleSort bubbleSort = new BubbleSort();
		Utils.dispaly(bubbleSort.bubblesort(arr));
	}

	private long[] bubblesort(long[] array) {
		int out, in;
		for (out = array.length - 1; out > 1; out--) {
			for (in = 0; in < out; in++) {
				if (array[in] > array[in + 1]) {
					Utils.swap(array, in, in + 1);
				}
			}
		}
		return array;
	}
}
