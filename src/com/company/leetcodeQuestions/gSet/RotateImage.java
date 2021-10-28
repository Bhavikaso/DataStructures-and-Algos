package com.company.leetcodeQuestions.gSet;

import java.util.Arrays;

public class RotateImage {

	//upside down - invert first
	//transpose it
	public static void rotate(int[][] matrix) {
		int num_rows = matrix.length;
		int num_cols= matrix[0].length;
		int r=num_rows-1;


		for (int i = 0; i < num_rows/2; i++) {
			for (int j = 0; j < num_cols; j++) {
				int temp =matrix[i][j];
				matrix[i][j]= matrix[r][j];
				matrix[r][j]=temp;
			}
			r--;
		}
		System.out.println(Arrays.deepToString(matrix));
		//transpose now
		for (int i = 0; i < num_rows; i++) {
			for (int j = 0; j <= i; j++) {
				if(i==j)
					continue;
				int temp = matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;

			}

		}
		System.out.println(Arrays.deepToString(matrix));

	}

	public static void main(String[] args) {
		int[][] arr ={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		rotate(arr);

	}
}
