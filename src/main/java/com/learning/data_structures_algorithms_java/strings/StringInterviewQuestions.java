package com.learning.data_structures_algorithms_java.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringInterviewQuestions {

	public static void main(String[] args) {
		StringInterviewQuestions stringQusestions = new StringInterviewQuestions();
//		System.out.println(stringQusestions.isUniqueCharsOptimal("abc"));
//		System.out.println(stringQusestions.isUniqueCharsOptimal("abcb"));
//		System.out.println(stringQusestions.isUniqueCharsOptimal("aabc"));
//		System.out.println(stringQusestions.isUniqueCharsOptimal("cabc"));
//		System.out.println(stringQusestions.isUniqueCharsOptimal("aABcDeFgGfEdCb"));

		System.out.println(stringQusestions.perumutataionToEachOther("abc", "bca"));
		System.out.println(stringQusestions.perumutataionToEachOtherOptimal("aaabc", "abcac"));
	}

	// ============ Question 1===================
	/*
	 * Is Unique: Implement an algorithm to determine if a string has all unique
	 * characters. What if you cannot use additional data structures?
	 * 
	 * Time complexity = o(n^2)
	 */
	private boolean isUnique(String input) {

		char[] charArray = input.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {

				if (charArray[i] == charArray[j]) {
					return false;
				}
			}
		}

		return true;
	}

	/*
	 * Is Unique: Implement an algorithm to determine if a string has all unique
	 * characters.
	 * 
	 * Time complexity = O(n) or we can say O(c) -> where c is the size of character
	 * size.
	 */
	private boolean isUniqueCharsOptimal(String str) {
		if (str.length() > 128)
			return false;

		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {// Already found this char in string
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

	// ====================Question 2 ================
	/*
	 * Check Permutation: Given two strings, write a method to decide if one is a
	 * permutation of the other.
	 */
	private boolean perumutataionToEachOther(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}

	private String sort(String s) {
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}

	private boolean perumutataionToEachOtherOptimal(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] letters = new int[128];
		char[] s_array = s.toCharArray();
		for (char c : s_array) {
			//letters[c]=letters[c]+1;
			letters[c]++;
			
		}
		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			letters[c]--;
			if (letters[c] < 0) {
				return false;
			}
		}
		return true;
	}
}
