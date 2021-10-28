package com.company.amextest;

import java.util.HashMap;
import java.util.Map;

public class Ques2 {
	class Tree {
		public int x;
		public Tree l;
		public Tree r;
	}
	
	public int solution(Tree T) {

		if(T==null)
			return 0;
		
			Map<Integer,Integer> distinct = new HashMap<>();
		 	return largestUniquePathHelper(T,distinct);
	}

	private int largestUniquePathHelper(Tree node, Map<Integer, Integer> m) {
		if(m.containsKey(node.x))
		{
			m.put(node.x, m.get(node.x) + 1);
		}
		else
		{
			m.put(node.x, 1);
		}

		int max_path = Math.max(largestUniquePathHelper(node.l, m),
				largestUniquePathHelper(node.r, m));


		if(m.containsKey(node.x))
		{
			m.put(node.x, m.get(node.x) - 1);
		}


		if (m.get(node.x) == 0)
			m.remove(node.x);

		return max_path;
	}


	public static void main(String args[]){
		//int[] arr={8,4,5,0,0,0,0,7};
		//duplicateZeros(arr);
		//System.out.println(digitsManipulations(123456));
	}
}
