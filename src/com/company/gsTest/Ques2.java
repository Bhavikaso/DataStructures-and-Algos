package com.company.gsTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ques2 {

	static int countSpecialElements(List<List<Integer>> matrix) {


		//int[][] matrix = matrix.stream().map(u -> u.toArray(new Integer[0])).toArray(int[][]::new);


		int row_size = matrix.size();
		int col_size = matrix.get(0).size();

		int rowmax[] = new int[row_size];
		int rowmin[] = new int[row_size];
		int colmax[] = new int[col_size];
		int colmin[] = new int[col_size];


		for (int i = 0; i < row_size; i++) {
			int rowMinVal = Integer.MAX_VALUE;
			int rowMaxVal = Integer.MIN_VALUE;
			for (int j = 0; j < col_size; j++) {
				int val = matrix.get(i).get(j);
				if (val > rowMaxVal)
					rowMaxVal = val;
				if (val < rowMinVal)
					rowMinVal = val;
			}
			rowmax[i] = rowMaxVal;
			rowmin[i] = rowMinVal;
		}

		for (int j = 0; j < col_size; j++) {
			int colMinVal = Integer.MAX_VALUE;
			int colMaxVal = Integer.MIN_VALUE;
			for (int i = 0; i < row_size; i++) {
				int val = matrix.get(i).get(j);
				if (val > colMaxVal)
					colMaxVal = val;
				if (val < colMinVal)
					colMinVal = val;
			}

			colmax[j] = colMaxVal;
			colmin[j] = colMinVal;
		}


		int count = 0;
		for (int i = 0; i < row_size; i++) {
			for (int j = 0; j < col_size; j++) {
				int val = matrix.get(i).get(j);
				if ((val == rowmax[i])
						|| (val == rowmin[i])
						|| (val == colmax[j])
						|| (val == colmin[j])) {
					count++;
				}
			}
		}

		return count;


	}


	public static void main(String[] args) {

	}
}
