package com.company.leetcodeQuestions.arrays;

/*https://leetcode.com/problems/non-decreasing-array/*/
public class NonDecreasingArray {


	public boolean checkPossibility(int[] nums) {
		int numViolation =0;

		for (int i = 1; i < nums.length; i++) {
			if(nums[i]>nums[i-1]){

				if(numViolation==1)
					return false;
				numViolation++;

				if(i<2 || nums[i-2]<=nums[i]){
					nums[i-1]=nums[i];
				}
				else {
					nums[i]=nums[i-1];
				}

			}
		}

		return true;
	}

}
