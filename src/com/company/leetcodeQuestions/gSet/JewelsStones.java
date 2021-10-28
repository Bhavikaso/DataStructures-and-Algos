package com.company.leetcodeQuestions.gSet;

import java.util.HashMap;
import java.util.Map;

public class JewelsStones {
	public int numJewelsInStones(String jewels, String stones) {

		//create Map of stones
		Map<Character, Integer> map = new HashMap<>();
		for (Character c : stones.toCharArray()) {
			if (!map.containsKey(c))
				map.put(c, 1);
			else {
				int val = map.get(c);
				map.put(c, ++val);
			}
		}
		int count = 0;
		for (char j : jewels.toCharArray()) {
			if (map.containsKey(j))
				count = count + map.get(j);

		}

		return count;
	}

}
