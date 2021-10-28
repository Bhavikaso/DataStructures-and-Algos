package com.company.leetcodeQuestions.arrays;

import java.util.Arrays;

/*https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/*/
public class SquaresOfSortedArray {
	public static int[] sortedSquares(int[] nums) {
		int sorted[] = new int[nums.length];
		int point = 0;
		/*int iterator=-1;
		while(arr[iterator]<0){
			if(iterator==length-1){
				break;
			}
			iterator++;
		}


		int point;
		if (iterator==0){
			point=1;
		}
		else {
			point=iterator;
			}
		}*/
		if(nums.length==1){
			sorted[0]=nums[0]*nums[0];
			return sorted;
		}

		while (nums[point] < 0 ) {
			if(point==nums.length-1){
				break;
			}
			point++;
		}


		int k = 0,j=point,i=point+1;
		if(point==nums.length-1){
			j=point;
		}

		while(j>=0 ){
			if(j==nums.length-1 ){
				break;
			}
			if(i==nums.length-1 && j==0){
				break;
			}
			if (Math.abs(nums[i]) > Math.abs(nums[j])) {
				sorted[k] = nums[j]*nums[j];
				j--;
			}
			else {
				sorted[k] = nums[i]*nums[i];;
				i++;
			}
			k++;
		}

		if(j>=0){
			for(int a=j;a>=0;a--){
				sorted[k]=nums[a]*nums[a];
				k++;
			}
		}
		if(i<nums.length){
			for(int a=i;a<nums.length;a++){
				sorted[k]=nums[a]*nums[a];
				k++;
			}
		}
		return sorted;
	}

	public static void main(String args[]){
		int[] arr={-3,0,2};
		System.out.println(Arrays.toString(sortedSquares(arr)));
	}

}

