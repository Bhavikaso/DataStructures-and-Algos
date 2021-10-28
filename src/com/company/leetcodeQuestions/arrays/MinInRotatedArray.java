package com.company.leetcodeQuestions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinInRotatedArray {

	public int findMin(int[] nums) {
		int min = nums[0];

		for (int i = 1; i < nums.length; i++)
			min = Math.min(min,nums[i]);
		return min;
	}
}
