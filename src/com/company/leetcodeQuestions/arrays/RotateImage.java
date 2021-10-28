package com.company.leetcodeQuestions.arrays;

public class RotateImage {

	public void rotate(int[][] matrix) {

		//row n-1 ,0-> row 0,column 0
		//row n-2,0 ->row 0, column 1
		//..
		//row 0 -> column n-1
		int l=matrix.length;
		for (int i = 0; i < matrix.length ; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int temp =matrix[i][j];
				matrix[i][j]=matrix[j][l-i];

			}

		}
	}

}
