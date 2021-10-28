package com.company.leetcodeQuestions.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	public static int firstUniqChar(String s) {
		Map<Character,Integer> map = new HashMap<>();
		int returnVal = -1;
		for (int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				int val = map.get(s.charAt(i));
				map.put(s.charAt(i), ++val);
			}
			else {
				map.put(s.charAt(i),1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if(map.get(s.charAt(i))==1) {
				returnVal = i;
				break;
			}

		}

		return returnVal;
	}

	public static void main(String args[]){
		String string= "leetcode";
		System.out.println(firstUniqChar(string));

	}
}
