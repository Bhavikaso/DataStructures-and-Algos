package com.company.leetcodeQuestions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionArray {

	public static int[] intersect(int[] nums1, int[] nums2) {
		int l1=nums1.length;


		List<Integer> list = new ArrayList<>();
		boolean [] used = new boolean[l1];
		int index;

		Arrays.sort(nums1);
		for (int a:nums2) {
			if((index = Arrays.binarySearch(nums1,a))>=0 && used[index]==false) {
				list.add(a);
				used[index]=true;
			}
		}

		return list.stream().mapToInt(Number :: intValue).toArray();
	}

	public static void main(String[] args){
		int[] arr={4,9,5};
		int[] arr2={9,4,9,8,4};
		System.out.println(intersect(arr,arr2));
	}
}
