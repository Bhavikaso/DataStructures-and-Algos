package com.company.hakerrankQuestions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*https://www.hackerrank.com/challenges/queens-attack-2/problem*/
public class QueenAttack {


	/*static int queensAttack(int boardSize, int numOfObstacles, int r_q, int c_q, int[][] obstacles ) {

		int count =0;

		Map<Integer,List<Integer>> rangeMap = new HashMap<>();
		setRange(obstacles,r_q,c_q,boardSize );
		int i=1,j=1;
		for (int i = 1; i <= boardSize; i++) {
			if(j=obstacleInRow(obstacles, i)!=-1){
			for (int j = 1; j <= boardSize; j++) {
				
			}
				if(i==r_q)
					if(j=obstacleInRow(obstacles, i)!=-1) {

					}
						|| j==c_q || (Math.abs(i-r_q) == Math.abs(j-c_q))){
					if(!twoDArrayContains(obstacles, i,j)) {
						count++;
					}
				}
			}
		}

		return count-1;
	}

	private static Map<Integer,Set<Integer>> setRangeRow(int[][] obstacles, int r_q, int c_q,int boardSize) {
		Map<Integer,Set<Integer>> rangeMapRow = new HashMap<>();
		Set<Integer> rangeList = new TreeSet<>();
		for (int i = 1; i <= boardSize; i++) {
			for (int j = 1; j <= boardSize; j++) {
				if(i==r_q && twoDArrayContains(obstacles, i,j)){
					rangeList.add(j);
					rangeMapRow.put(i,rangeList);
				}
			}
		}
		return rangeMapRow;
	}

	private static boolean twoDArrayContains(int[][] obstacles, int i, int j) {
		for (int k = 0; k < obstacles.length; k++) {
			if(obstacles[k][0]==i && obstacles[k][1]==j)
				return true;
		}

		return false;
	}

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) throws IOException {
		/*int boardSize = 5;
		int numOfObstacles =3;
		int row=4, col=3;
		int obstacles[][] = {{5,5},{4,2},{2,3}};
		/*for (int i = 0; i < numOfObstacles; i++) {
			obstacles[i][0]=
		}*BufferedWriter/*/
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		/*String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		String[] r_qC_q = scanner.nextLine().split(" ");

		int r_q = Integer.parseInt(r_qC_q[0]);

		int c_q = Integer.parseInt(r_qC_q[1]);

		int[][] obstacles = new int[k][2];

		for (int i = 0; i < k; i++) {
			String[] obstaclesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 2; j++) {
				int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
				obstacles[i][j] = obstaclesItem;
			}
		}

		int result = queensAttack(n, k, r_q, c_q, obstacles);



		scanner.close();

		System.out.println("Number of points "+result);

	}*/

}