package com.company.leetcodeQuestions.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

import javax.lang.model.type.PrimitiveType;

public class KthLargestElementInArray {

	public int findKthLargest(int[] nums, int k) {

		int [] result =Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

		return result[k];
	}
}
