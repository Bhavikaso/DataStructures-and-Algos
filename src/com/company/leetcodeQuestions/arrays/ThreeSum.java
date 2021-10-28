package com.company.leetcodeQuestions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/3sum/
 */
public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> res = new HashSet<>();
		Set<Integer> dups = new HashSet<>();
		Map<Integer, Integer> seen = new HashMap<>();
		for (int i = 0; i < nums.length; ++i)
			if (dups.add(nums[i])) {
				for (int j = i + 1; j < nums.length; ++j) {
					int complement = -nums[i] - nums[j];
					if (seen.containsKey(complement) && seen.get(complement) == i) {
						List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
						Collections.sort(triplet);
						res.add(triplet);
					}
					seen.put(nums[j], i);
				}
			}
		return new ArrayList(res);
	}

	public static void main(String[] args) {
		int[] arr={-1,0,1,2,-1,-4};
		List<List<Integer>> ls = threeSum(arr);
		ls.forEach(l->{
			l.stream().forEach(m-> System.out.println(m));
		});
	}
}
