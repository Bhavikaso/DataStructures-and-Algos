package com.company.leetcodeQuestions.strings;

public class ValidPalindrome {

	public static boolean isPalindrome(String s) {

		s=s.replaceAll("[^a-zA-Z]","").toLowerCase();

		System.out.println(s);
		int start=0,end=s.length()-1;
		while (start<end){
			if (s.charAt(start)!=s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;

	}

	public static void main(String[] args) {
			String s = "ab_a";
		System.out.println(isPalindrome(s));
	}
}
