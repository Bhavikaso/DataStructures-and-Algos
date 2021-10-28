package com.company.leetcodeQuestions.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/circular-array-loop/
 */
public class CircularArrayLoop {

	public boolean circularArrayLoop(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		int i=0;
		map.put(i,nums[0]);
		i=i+nums[i];

		while(!map.containsKey(i)){
			map.put(i,nums[i]);
			i=i+nums[i];
			if(map.containsKey(i))
				return true;

		}
		return false;
	}

}
