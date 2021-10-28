package com.company.leetcodeQuestions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DeleteNEarn {

	public static int deleteAndEarn(int[] nums) {
		//apply greedy approach
		/*//2. give pref to highest frequency num
		Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
		List<Integer> ls = new LinkedList<>(Arrays.asList());

		for(int i=0;i<nums.length;i++)
			map.put(nums[i],map.getOrDefault(nums[i],0)+1);


		int points =0;
		if(map.values().stream().anyMatch(a->a>1)){
			Map<Integer, Integer> newMap=map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
					.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (oldValue, newValue)-> oldValue, 	LinkedHashMap::new ));
			for (Map.Entry<Integer, Integer> e :newMap.entrySet()) {
				int val = e.getKey();
				ls.remove(val);
				if(ls.contains(val+1))
					ls.remove(val+1);
				if(ls.contains(val-1))
					ls.remove(val-1);
				points+=e.getKey();
		}


	}
*/
		//Leecode Solution


			int[] count = new int[10001];
			for (int x: nums) count[x]++;
			int avoid = 0, using = 0, prev = -1;

			for (int k = 0; k <= 10000; ++k) if (count[k] > 0) {
				int m = Math.max(avoid, using);
				if (k - 1 != prev) {
					using = k * count[k] + m;
					avoid = m;
				} else {
					using = k * count[k] + avoid;
					avoid = m;
				}
				prev = k;
			}
			return Math.max(avoid, using);
		}


	public static void main(String[] args) {
		deleteAndEarn(new int[] { 2, 2, 3, 3, 3, 4 });
	}

}

