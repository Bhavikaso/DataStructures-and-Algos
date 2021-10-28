package com.company.leetcodeQuestions.arrays;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		int last = digits.length - 1;
		int i = last, carry = 0;
		while (i >= 0) {

			if (i == last)
				digits[i] = (digits[i] + 1) % 10;
			else
				digits[i] = (digits[i] + carry) % 10;
			carry = digits[i] / 10;

		}

		return digits;
	}
}
