package com.company.leetcodeQuestions.arrays;

public class MaxSubarrayProblem {

	public int kadansAlgo(int[] arr){
		int max_sum=arr[0];

		int curr_sum=arr[0];

		for (int i = 1; i < arr.length; i++) {


			curr_sum=Math.max(curr_sum+arr[i],arr[i]);

			max_sum=Math.max(curr_sum,max_sum);

		}

		return max_sum;

	}
}
