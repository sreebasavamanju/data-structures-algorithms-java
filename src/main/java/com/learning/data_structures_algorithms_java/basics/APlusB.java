package com.learning.data_structures_algorithms_java.basics;

import java.util.Scanner;

public class APlusB {

	 static int sumOfTwoDigits(int first_digit, int second_digit) {
	        return first_digit + second_digit;
	    }

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int a = s.nextInt();
	        int b = s.nextInt();
	        System.out.println(sumOfTwoDigits(a, b));
	    }
}
