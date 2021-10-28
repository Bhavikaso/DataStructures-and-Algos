package com.company.leetcodeQuestions.arrays;

public class MinPathSum {
	public static int minPathSum(int[][] grid) {
		int i,j = 0;

		for (i = 0 ; i <grid.length-1; i++) {
			for (j=0; j <grid[0].length-2 ; j++) {
				System.out.println("comes in j for loop with i and j = "+i+j );
				System.out.println("grid is "+grid[i][j]);
				if(i==grid.length-2 && j< grid[0].length-1) //going right
					grid[i][j+1]=grid[i][j]+grid[i][j+1];
				else if(j == grid[0].length-1 && i<grid.length-2 )
					grid[i+1][j]=grid[i][j]+grid[i+1][j];  //going down
				/*if(i == 2 && j == grid[0].length-2)
					grid[i][j]=grid[i][j]+grid[i-1][j];*/
				else {
					if(grid[i + 1][j] < grid[i][j + 1])
						grid[i + 1][j]=grid[i + 1][j] + grid[i][j];
					else
						grid[i][j + 1]=grid[i][j + 1] + grid[i][j];
				}//going down
				System.out.println("Grid sum is "+grid[i][j]);
			}
			System.out.println("Grid sum is "+grid[i][j]);
		}

		return grid[i][j] ;
	}

	public static void main(String[] args) {
		int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(minPathSum(arr));
	}
}
