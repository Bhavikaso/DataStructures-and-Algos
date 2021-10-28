package com.company.leetcodeQuestions.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class MaxsizeSubarrayEqualToK {

	public static int maxSubArrayLen(int[] nums, int k) {
		int sum = 0, max = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			if (sum == k) max = i + 1;
			else if (map.containsKey(sum - k)) max = Math.max(max, i - map.get(sum - k));
			if (!map.containsKey(sum)) map.put(sum, i);
		}
		return max;
	}

	public int maxSubArrayLen_MySolution(int[] nums, int k) {
		//idea - take sum of all elements in one loop
		//keep removing elements fromboth ends onne by one -- to get a match

		int sum = Arrays.stream(nums).sum();
		if(sum==k)
			return nums.length;

		int i=0, j=nums.length-1;
		int val = sum;
		while(i<j){
			if(val==k)
				return j-i+1;
			if(val-nums[i]==k)
				return j-(i+1)+1;
			if(val-nums[j]==k)
				return (j-1)-i+1;
			val=val-nums[i]-nums[j];
			i++;j--;
		}

		return 0;
	}

	public static void main(String[] args) {
		maxSubArrayLen(new int[]{-2,1,-3,4,-1,2,1,-5,4},0);
	}
}
