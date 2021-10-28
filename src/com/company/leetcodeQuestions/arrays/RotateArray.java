package com.company.leetcodeQuestions.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateArray {

	public void rotate(int[] nums, int k) {
			int l = nums.length;
			k=k%l;
			 //reverse all numbers
			 reverse(nums,0,l-1);

			//reverse the start k elements
			 reverse(nums,0,k-1);

			 //reverse the last l-k elements
			reverse(nums,k,l-1);
		}
		void reverse (int [] num, int start, int end){

			while (start<end){
				int temp = num[start];
				num[start]=num[end];
				num[end]=temp;
				start++;
				end--;
			}

	}
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1])
				return true;
		}
		return false;
	}
}
