package com.learning.data_structures_algorithms_java.maths;

import java.util.Scanner;

public class GCD {
	private static long euclid_gcd(int a, int b) {
		long divisor = a >= b ? a : b;
		long dividend = a <= b ? a : b;
		while (divisor != 0) {
			long remainder = dividend % divisor;
			dividend = divisor;
			divisor = remainder;
		}
		return dividend;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(euclid_gcd(a, b));
	}
}
