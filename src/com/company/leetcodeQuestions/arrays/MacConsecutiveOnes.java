package com.company.leetcodeQuestions.arrays;

/*https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/*/

public class MacConsecutiveOnes {
		public static int findMaxConsecutiveOnes(int[] nums) {
			int count = 0;
			int max=0;
			for (int i = 0; i < nums.length; i++) {
				if(nums[i]==1){
					count++;
					if(max<count){
						max=count;
					}
				}

				else{
					count=0;
				}

			}

			return max;
		}

		public static void main(String args[]){
			int[] arr={1};
			System.out.println(findMaxConsecutiveOnes(arr));
		}

}
