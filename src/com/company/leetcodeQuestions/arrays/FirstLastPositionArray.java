package com.company.leetcodeQuestions.arrays;


import java.util.Arrays;

/*https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/*/
public class FirstLastPositionArray {

	/* nums = [5,7,7,8,8,10], target = 8
	public int[] searchRange(int[] nums, int target) {
		/*boolean single = true;
		int index =Arrays.binarySearch(nums,target);
		System.out.println(index);
		if(index<0){
			return new int[]{-1,-1};
		}
		if(index==0 ){
			if(nums.length ==1 || (nums[index]!=nums[index+1]) )
				return new int[]{0,0};
			else
				return new int[]{0,1};
		}
		else if(nums[index-1]==nums[index]){
			return new int[]{index-1,index};
		}
		else {
			return new int[]{index,index+1};
		}*/
		/*int start = 0 , end = nums.length-1;
		int mid = start+end/2;
		if(nums[mid]==target){
			int i = mid;
			while(i<nums.length || nums[i]!=nums[i+1]){
				i++;
			}
		}




	}*/


	/**nums = [5,7,7,8,8,10], target = 8
	 * Approach : binary search to find mid value -->
	 * if mid value is target(search first position and search the last position
	 * if mid < target --> search in right part
	 * if mid>target --> search in left part
 	 */

	public static int[] searchRange(int[] nums, int target) {

		int firstP= searchRangeHelper(nums, target,true);
		int lastP=searchRangeHelper(nums, target,false);

		if(firstP==-1)
			return new int[]{-1,-1};

		return new int[]{firstP,lastP};

	}

	private static int searchRangeHelper(int[] nums, int target, boolean firstPosition) {
		return searchRangeHelperAgain(nums, target, firstPosition, 0, nums.length-1) ;


	}

	private static int searchRangeHelperAgain(int[] nums, int target, boolean firstPosition, int start, int end) {
		if(start>end)
			return -1;
		int val = start+end;
		System.out.println(val);
		int mid=val/2;
		if(nums[mid]==target){
			if(firstPosition) {
				if (mid == start || nums[mid - 1] != target)
					return mid;
				else
					return searchRangeHelperAgain(nums, target, firstPosition,  start, mid - 1);
			}
			else{
				if(mid == end || nums[mid + 1] != target)
					return mid;
				else
					return searchRangeHelperAgain(nums,  target, firstPosition, mid+1, end );
			}
		}
		else if(nums[mid]<target)
			return searchRangeHelperAgain(nums,  target, firstPosition, mid+1, end );
		else
			return searchRangeHelperAgain(nums, target, firstPosition,start, mid-1 );


	}

	/**
	 * Iterative solution - space -O(1)
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] searchRange_iterative(int[] nums, int target) {

		int firstOccurrence = this.findBound(nums, target, true);

		if (firstOccurrence == -1) {
			return new int[]{-1, -1};
		}

		int lastOccurrence = this.findBound(nums, target, false);

		return new int[]{firstOccurrence, lastOccurrence};
	}

	private int findBound(int[] nums, int target, boolean isFirst) {
		int N = nums.length;
		int begin = 0, end = N - 1;

		while (begin <= end) {

			int mid = (begin + end) / 2;

			if (nums[mid] == target) {

				if (isFirst) {

					// This means we found our lower bound.
					if (mid == begin || nums[mid - 1] != target) {
						return mid;
					}

					// Search on the left side for the bound.
					end = mid - 1;

				} else {

					// This means we found our upper bound.
					if (mid == end || nums[mid + 1] != target) {
						return mid;
					}

					// Search on the right side for the bound.
					begin = mid + 1;
				}

			} else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				begin = mid + 1;
			}
		}

		return -1;
	}


	public static void main(String[] args) {
		int num[] =  {5,7,7,8,8,10};
		searchRange(num,8);

	}


}