package com.company.leetcodeQuestions.gSet.mocktest;

import java.util.Arrays;

public class HeightDifference {
	public int heightChecker(int[] heights) {
		int another [] = Arrays.copyOfRange(heights,0,heights.length);
		Arrays.sort(another);
		int count=0;
		for (int i = 0; i < heights.length; i++) {
			if(heights[i]!=another[i])
				count++;
		}
		return count;
	}
}
