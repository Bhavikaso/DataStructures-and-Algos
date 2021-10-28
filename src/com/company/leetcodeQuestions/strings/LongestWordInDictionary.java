package com.company.leetcodeQuestions.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public class LongestWordInDictionary {

	public static String findLongestWord(String s, List<String> dictionary) {
		for(String each:dictionary){
			if(each.length()==s.length() && each.equals(s))
				return each;
			if(each.length()>s.length())
				dictionary.remove(each);
		}

		Collections.sort(dictionary, (o1, o2) -> o2.length()-o1.length());

		for (String a:dictionary) {
			if (isSubsequence(a,s))
				return a;
		}

		return "";
	}
	private static boolean isSubsequence(String x, String y) {
		int j = 0;
		for (int i = 0; i < y.length() && j < x.length(); i++)
			if (x.charAt(j) == y.charAt(i))
				j++;
		return j == x.length();
	}


	public static void main(String[] args) {
		List<String> l = new ArrayList<>(Arrays.asList(new String[]{"abe","abc"}));
		findLongestWord("abce",l);
	}

	}



