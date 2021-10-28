package com.company.leetcodeQuestions.divideandconquer;

/*https://leetcode.com/explore/learn/card/recursion-ii/470/divide-and-conquer/2872/*/
public class SearchinMatrix {

	public boolean searchMatrix(int[][] matrix, int target) {
		//divide the matrix
		if(matrix==null || matrix.length==1)
			return false;
		int rows =matrix.length;
		int col = matrix[0].length;
		int pivotRow = rows/2;
		int pivotCol = col/2;
		if(target==matrix[pivotRow][pivotCol])
			return true;
		if(target<matrix[pivotRow][pivotCol]){

		}

		return false;
	}
}
