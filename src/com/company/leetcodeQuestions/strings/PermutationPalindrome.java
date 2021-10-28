package com.company.leetcodeQuestions.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PermutationPalindrome {

	public boolean canPermutePalindrome(String s) {
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
		}

		int countMiddle=0;
		for (int i :map.values()){
			countMiddle+=i % 2;


		}

		return countMiddle<=1;
	}
}
