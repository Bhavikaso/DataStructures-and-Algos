package com.company.leetcodeQuestions.strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {

		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		Map<Character, Character> mapping = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			//map strings
			if (mapping.containsKey(sChar[i])) {
				if (mapping.get(sChar[i]) != tChar[i])
					return false;
			}
			else {
				mapping.put(sChar[i], tChar[i]);
			}
		}
		return true;
	}

	//Another approach

	/**
	 * the idea is we are comparing the index of both the strings
	 * @param s
	 * @return
	 */
	private static String transformString(String s) {
		Map<Character, Integer> indexMapping = new HashMap<>();
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < s.length(); ++i) {
			char c1 = s.charAt(i);

			if (!indexMapping.containsKey(c1)) {
				indexMapping.put(c1, i);
			}

			builder.append(indexMapping.get(c1));
		}
		System.out.println(builder.toString());
		return builder.toString();
	}

	public static boolean isIsomorphic_another(String s, String t) {
		return transformString(s).equals(transformString(t));
	}


	public static void main(String[] args) {
		System.out.println(isIsomorphic_another("badc","baba"));
	}
}
