package com.company.leetcodeQuestions.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 */
public class MinsizeSubarraySum {
	public int minSubArrayLen(int target, int[] nums) {

		//for storing index and length
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0, j;
		for (int i = 0; i < nums.length-1; i++) {
			j = i;
			sum=0;
			while (j<nums.length && sum < target)
				sum += nums[j++];
			if(sum>=target)
				map.put(i, j - i);

		}
		if(map.size()>0)
			return map.entrySet().stream().min(Map.Entry.comparingByValue()).get().getValue();
		else
			return 0;
	}
}
