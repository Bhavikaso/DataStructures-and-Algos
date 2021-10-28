package com.company.leetcodeQuestions.gSet;

public class ContainerWithMostWater {

	public static int maxArea(int[] height) {

			int max =0;

			for (int i= 0,j=height.length-1; i < j;) {
				int val = Math.min(height[i],height[j]);
				int area = val*(j-i);
				if (max<area){
					max=area;
				}

				if (height[i] < height[j])
					i++;
				else
					j--;

			}
			return max;


		}

	public static void main(String[] args) {
		int[] arr = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(arr));

	}

	}
