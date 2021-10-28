package com.company.leetcodeQuestions.arrays;

public class PivotElement {

	public int pivotIndex(int[] nums) {

		int leftSum=nums[0], rightSum=nums[nums.length-1];
		int i=1,j=nums.length-2;
		while(i<=j){
			if(leftSum==rightSum ){
				if(i==j)
					return i;
				else{
					i++;
					j--;
				}
			}
			else if(leftSum<rightSum){
				leftSum+=nums[i];
				i++;
			}
			else{
				rightSum+=nums[j];
				j--;
			}

		}
		return -1;
	}
}
