package com.company.leetcodeQuestions.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class HighFive {

	public int[][] highFive(int[][] items) {
		TreeMap<Integer, PriorityQueue<Integer>> map = new TreeMap<>();

		for (int i = 0; i < items.length; i++) {
			if(map.containsKey(items[i][0])) {
				map.get(items[i][0]).add(items[i][1]);
			}
			else {
				PriorityQueue<Integer> p = new PriorityQueue<>((o1, o2) -> o2.intValue() - o1.intValue());
				p.add(items[i][1]);
 				map.put(items[i][0], p);
			}
		}
		List<int[]> solution = new ArrayList<>();

		 for(int id : map.keySet()){
		 	int sum =0;
			 for (int i = 0; i < 5; i++)
				 sum+=map.get(id).poll();
			 solution.add(new int[]{id,sum});
		 }
		 int [][] solutionArray = new int[solution.size()][];
		 return solutionArray;
	}
}
