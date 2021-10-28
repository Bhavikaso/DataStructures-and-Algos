package com.company.leetcodeQuestions.arrays;
/*https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/*/

public class NumbersWithEvenDigits {
	public static int findNumbers(int[] nums) {
		int countEvendigitsNumber =0;
		for (int i = 0; i < nums.length; i++) {
			if (numOfDigits(nums[i]) % 2 == 0) {
				countEvendigitsNumber++;
			}
		}
		return countEvendigitsNumber;
	}

	private static int numOfDigits(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}


	public static void main(String args[]){
		int[] arr={12,345,2,6,7896};
		System.out.println(findNumbers(arr));
	}

}
