package com.company.leetcodeQuestions.arrays;

import java.util.Arrays;

public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
		int i = 0;//pointer for iterating array

		int j = 0; //pointer for keeping track of non zeros


		for (; j < nums.length; i++) {

			while (j < nums.length - 1 && nums[j] == 0)
				j++;
			nums[i] = nums[j];
			j++;
		}

		while (i < nums.length) {
			nums[i] = 0;
			i++;
		}

		System.out.println(Arrays.toString(nums));
	}

	public static void main(String args[]){
		int[] arr={0,1,0,3,12};
		moveZeroes(arr);
	}
}
