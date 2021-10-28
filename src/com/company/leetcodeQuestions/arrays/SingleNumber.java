package com.company.leetcodeQuestions.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
		//add elements to hashmap
		Map<Integer,Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])){
				int val = map.get(nums[i]);
				map.put(nums[i], ++val);
			}
			else
				map.put(nums[i], 1);
		}

		int returnVal=0;

		for (Entry entry:map.entrySet()) {
			if(entry.getValue().equals(1))
				returnVal = (int)entry.getKey();
		}

		return returnVal;
	}

	public static void main(String[] args){
		int[] arr={2,2,1};
		System.out.println(singleNumber(arr));
	}
}
