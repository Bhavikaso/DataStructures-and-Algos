package com.company.leetcodeQuestions.strings;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/longest-repeating-substring/
 */
public class LongestRepeatingSubtring {
	public static int search(int L, int n, String S) {
		HashSet<String> seen = new HashSet();
		String tmp;
		for(int start = 0; start < n - L + 1; ++start) {
			tmp = S.substring(start, start + L);
			if (seen.contains(tmp)) return start;
			seen.add(tmp);
		}
		return -1;
	}

	public static int longestRepeatingSubstring(String S) {
		int n = S.length();
		// binary search, L = repeating string length
		int left = 1, right = n;
		int L;
		while (left <= right) {
			L = left + (right - left) / 2;
			if (search(L, n, S) != -1) left = L + 1;
			else right = L - 1;
		}

		return left - 1;
	}

	public static void main(String[] args) {
		System.out.println(longestRepeatingSubstring("aabcaabdaab"));
	}
}
