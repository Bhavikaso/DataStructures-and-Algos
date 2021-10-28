package com.company.leetcodeQuestions.sorting;

import java.util.Arrays;

/* Divide and conquer*/
public class MergeSort {

	public int[] merge(int[] left, int[] right){
		int [] result = new int[left.length+right.length];
		int leftCursor=0, rightCursor=0,resutCursor =0;

		while(leftCursor<left.length && rightCursor<right.length){
			if(left[leftCursor]<right[rightCursor])
				result[resutCursor++]=left[leftCursor++];
			else
				result[resutCursor++]=right[rightCursor++];
		}

		while(leftCursor<left.length){
			result[resutCursor++]=left[leftCursor++];
		}
		while(rightCursor<right.length){
			result[resutCursor++]=right[rightCursor++];
		}

		return result;

	}

	public int[] mergeSort(int[] arr){
		if(arr.length<=1)
			return arr;

		int mid = arr.length/2;
		int [] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
		int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
		return merge(left,right);

	}



}
