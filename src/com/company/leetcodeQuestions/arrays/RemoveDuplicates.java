package com.company.leetcodeQuestions.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	//we l keep two pointers

	public static int removeDuplicates(int[] nums) {
		//pointer for 1 by 1 step
		int i=0;

		//fast runner
		for (int j = 1; j < nums.length;j++) {
			if(nums[j]!=nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		System.out.println(Arrays.toString(nums));
		//pointer for finding the next unique element
		return i+1;
	}


	public static void main(String args[]){
		int[] arr={0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(arr);
	}
}
