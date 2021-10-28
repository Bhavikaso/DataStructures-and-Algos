package com.company.leetcodeQuestions.gSet;

/* Finding num of islands in an array using dfs
*https://leetcode.com/problems/number-of-islands/
*/
public class NumOfIslands {

	public static int numIslands(char[][] grid) {

		if (grid == null || grid.length == 0)
			return 0;
		int numIslands = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1') {
					++numIslands;
					dfs(grid, i, j);
				}
			}
		}

		return numIslands;
	}

	private static void dfs(char[][] grid, int i, int j) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0')
			return;


		grid[i][j] = '0';
		dfs(grid, i - 1, j);
		dfs(grid, i + 1, j);
		dfs(grid, i, j - 1);
		dfs(grid, i, j + 1);

	}

	public static void main(String[] args) {
		char[][] nums = {
				{ '1', '1', '0', '0', '0' },
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };
		System.out.println(numIslands(nums));

	}
}
