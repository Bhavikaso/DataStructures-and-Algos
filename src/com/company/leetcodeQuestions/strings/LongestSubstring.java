package com.company.leetcodeQuestions.strings;

public class LongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		if(s.isEmpty())
			return 0;
		char [] stringChars = s.toCharArray();
		String stringSequence = String.valueOf(stringChars[0]);
		String longestString = "";
		for (char c :stringChars) {
			if(stringSequence.contains(String.valueOf(c))){
				stringSequence = stringSequence.substring(1);
				System.out.println("from if"+stringSequence);
			}
			else{
				stringSequence=stringSequence+String.valueOf(c);
				System.out.println("from else"+stringSequence);
			}
			if(stringSequence.length()>longestString.length())
				longestString=stringSequence;
		}

		System.out.println("longest sequence "+longestString);
		return longestString.length();
	}

	public static void main(String args[]){
		lengthOfLongestSubstring("abcabcbb");
		lengthOfLongestSubstring("pwwkew");
	}


}
