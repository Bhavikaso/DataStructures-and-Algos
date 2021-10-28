package com.company.leetcodeQuestions.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class MedianOfSortedArray {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
			int[] new_arr = new int[nums1.length+nums2.length];

			int len = nums1.length>nums2.length?nums1.length:nums2.length;
			int i=0,j=0, k;
			for (k = 0; k < len; k++) {
				if(nums1[i]>nums2[j])
					new_arr[k]=nums2[j++];
				else
					new_arr[k]=nums1[i++];

			}
			while(i<nums1.length)
				new_arr[k++]=nums1[i++];

			while (j<nums2.length)
				new_arr[k++]=nums2[j++];

			Arrays.stream(new_arr).forEach(num -> System.out.println(num));
			//find median
			double median;
			if(new_arr.length%2==0){
				int first = new_arr.length/2;
				int sec = new_arr.length/2+1;
				System.out.println("first "+first+ "sec "+sec);
				median=(double)(new_arr[(first-1)]+new_arr[(sec-1)])/2;
				System.out.println(median);
			}
			else {
				System.out.println("first "+new_arr.length/2);
				median=new_arr[(new_arr.length/2)];
			}

			return median;
		}

	public static void main(String[] args) {
		int[] num1={1,2};
		int[] num2={3,4};
		System.out.println(findMedianSortedArrays(num1,num2));
	}
}
