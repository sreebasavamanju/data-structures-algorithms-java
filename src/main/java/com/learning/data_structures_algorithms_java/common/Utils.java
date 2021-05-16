package com.learning.data_structures_algorithms_java.common;

public class Utils {

	public static void dispaly(long[] arr) {
		for (long l : arr) {
			System.out.print(l + " ");
		}
		System.out.println("");
	}
	
	public static void swap(long[] arr, int i, int j) {
		long temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
