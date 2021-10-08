package com.georgeisaev.faang.leetcode.alg.array.easy.conversion;

public class PlusOneImpl implements PlusOne {

	/**
	 * {@inheritDoc}
	 *
	 * @param digits a large integer represented as an integer array digits
	 * @return the resulting array of digits
	 */
	@Override
	public int[] plusOne(int[] digits) {
		int cumulating = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i] += cumulating;
			if (digits[i] < 10) {
				cumulating--;
				break;
			} else {
				digits[i] = 0;
			}
		}
		if (cumulating > 0) {
			int[] shiftDigits = new int[digits.length + 1];
			System.arraycopy(digits, 0, shiftDigits, 1, digits.length);
			shiftDigits[0] = cumulating;
			return shiftDigits;
		}
		return digits;
	}

}
