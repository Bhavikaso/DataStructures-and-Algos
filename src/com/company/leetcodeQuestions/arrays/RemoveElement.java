package com.company.leetcodeQuestions.arrays;

import java.util.Arrays;

public class RemoveElement {

		public static int removeElement(int[] nums, int val) {
			int count=0;
			int valCount=0;
			//get total num of vals in array
			for (int i = 0; i < nums.length; i++) {
				if(nums[i]==val){
					valCount++;
				}
			}
			int lastIndex=nums.length-1;
			for(int i=0;i<nums.length-valCount;i++){
				if(nums[i]==val){
					//swap
					while(nums[lastIndex]==val){
						lastIndex--;
					}

					int temp = nums[i];
					nums[i] = nums[lastIndex];
					nums[lastIndex] = temp;
					lastIndex--;
					count++;

				}

			}
			System.out.println(Arrays.toString(nums));
			System.out.println("this is count"+count);
			System.out.println("this is val count"+valCount);

			return nums.length-valCount;
		}

		public static void main(String[] args){
			int[] arr={3,2,2,3};
			removeElement(arr,3);
		}
	}

