package com.company.leetcodeQuestions.strings;

import java.util.Arrays;

public class AnagramString {

	public boolean isAnagram(String s, String t) {
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		Arrays.sort(sChar);
		Arrays.sort(tChar);

		return sChar.toString().equals(tChar.toString());


	}
}
