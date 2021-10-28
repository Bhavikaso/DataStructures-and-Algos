package com.company.leetcodeQuestions.gSet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/interview/card/google/59/array-and-strings/3054/
 */
public class LongestSubstringAtMostTwoChars {
	public int lengthOfLongestSubstringTwoDistinct(String s) {
		int n =s.length();
		int left=0, right=0;
		int max_length =2;

		Map<Character,Integer> map = new HashMap<>();

		while (right<n){
			map.put(s.charAt(right),right++);

			if(map.size()== 3) {
				int del_index = Collections.min(map.values());
				map.remove(s.charAt(del_index));
				left=del_index+1;
			}

			max_length=Math.max(max_length,right-left);
		}
		return max_length;
	}
}
