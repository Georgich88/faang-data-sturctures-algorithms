package com.georgeisaev.faang.codewars.fundamentials.findodd;

import java.util.Arrays;

/**
 * Given an array of integers, find the one that appears an odd number of times.
 * <p>
 * There will always be only one integer that appears an odd number of times.
 */
public class FindOdd {

	private FindOdd() {
		throw new UnsupportedOperationException("");
	}

	public static int findIt(int[] a) {
		if (a.length == 1) {
			return a[0];
		}
		Arrays.sort(a);
		int odd = a[0];
		int count = 1;
		for (int i = 1; i < a.length; i++) {
			if (a[i] == odd) {
				count++;
			} else if (count % 2 != 0) {
				return odd;
			} else {
				odd = a[i];
				count = 1;
			}
		}
		return odd;
	}

	/**
	 * XOR cancels out everytime XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving
	 * the odd number out
	 *
	 * @param numbers an array of integers contains only one integer that appears an odd number of times.
	 * @return odd number
	 */
	public static int findItXor(int[] numbers) {
		int xor = 0;
		for (int number : numbers) {
			xor ^= number;
		}
		return xor;
	}

}
