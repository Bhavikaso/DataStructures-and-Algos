package com.company.leetcodeQuestions.arrays;

import java.util.Arrays;

/*https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/*/
public class DuplicateZeros {
	public static void duplicateZeros(int[] arr) {
		int last=arr.length-1;
		int copyFrom;
		int copyTo=arr.length-1;

		for (int i = 0; i < last; i++) {
			if(arr[i]==0){
				last--;
			}
		}
		copyFrom=last;
		while(copyTo>0){
			if(arr[copyFrom]==0){
				arr[copyTo]=0;
				arr[copyTo-1]=0;
				copyTo=copyTo-2;
			}
			else{
				arr[copyTo]=arr[copyFrom];
				copyTo--;
			}
			copyFrom--;
		}

		System.out.println(Arrays.toString(arr));
	}


	public static void main(String args[]){
		int[] arr={8,4,5,0,0,0,0,7};
		duplicateZeros(arr);
	}

}
