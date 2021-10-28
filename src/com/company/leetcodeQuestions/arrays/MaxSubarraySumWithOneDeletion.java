package com.company.leetcodeQuestions.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaxSubarraySumWithOneDeletion {

	public int maximumSum(int[] arr) {

		//find total sum
		int tot_sum= Arrays.stream(arr).sum();
		//max in arr
		int maxElement = Arrays.stream(arr).max().getAsInt();

		Set<Integer> set = new HashSet<>();

		for(int a :arr)
			set.add(tot_sum-a);

		int afterDropVal =  set.stream().max(Integer::compare).get();
		return Math.max(maxElement,afterDropVal);


	}
}
