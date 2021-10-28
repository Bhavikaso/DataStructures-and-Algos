package com.company.gsTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/count-number-of-teams/submissions/
 * Here,we are traversing the array from 1st index to 2nd last index. Inside the loop ,we are tracking the elements which are greater or less on each side.
 * Since two pattern selection are possible,so the no. of elements less than the current element and greater than the current will give no. of accending pattern. Similarly the descending one!
 */
public class Ques1 {
	static int getCountOfPossibleTeams(List<Integer> coders) {
		/*int[] arr = coders.stream().mapToInt(i->i).toArray();
		int count = 0;
		int len = arr.length;
		for (int j = 0; j < len; j++) {
			int leftSmaller = 0, rightLarger = 0;
			int leftLarger = 0, rightSmaller = 0;
			for (int i = 0; i < j; i++) {
				if (arr[i] < arr[j]) {
					leftSmaller++;
				} else if (arr[i] > arr[j]) {
					leftLarger++;
				}
			}
			for (int k = j + 1; k < len; k++) {
				if (arr[j] < arr[k]) {
					rightLarger++;
				} else if (arr[j] > arr[k]) {
					rightSmaller++;
				}
			}
			count += leftSmaller * rightLarger + leftLarger * rightSmaller;
		}

		return count;*/
		int[] rating = coders.stream().mapToInt(i -> i).toArray();
		int n = rating.length;

		int total = 0;
		for (int i = 1; i < n - 1; i++) {
			int leftless = 0; // for accending pattern
			int rightgreater = 0; // for accending pattern

			int leftgreater = 0; // for descending pattern
			int rightless = 0;  //for descending pattern

			for (int j = i - 1; j >= 0; j--) {
				if (rating[i] > rating[j]) {
					leftless++;
				}
				else {
					leftgreater++;
				}
			}
			for (int j = i + 1; j < n; j++) {
				if (rating[i] > rating[j]) {
					rightless++;
				}
				else {
					rightgreater++;
				}
			}
			/*leftless * rightgreater --> ascending patter, rightless * leftgreater--> descending pattern
			total += leftless * rightgreater + rightless * leftgreater; // no of counts possible from the ith index.

		}
		return total;
	}



	public static void main(String[] args) {
		Integer [] rating = {2,5,3,4,1};
		getCountOfPossibleTeams((Arrays.asList(rating)));

	}*/
		}
		return 0;
	}
}