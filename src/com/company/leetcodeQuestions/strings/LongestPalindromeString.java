package com.company.leetcodeQuestions.strings;

public class LongestPalindromeString {
	/**
	 * "babad" --> "bab"
	 *
	 *
	 *
	 * @param s
	 * @return
	 */
	public static String longestPalindrome(String s) {
		int i=0,j=s.length()-1;

		while(i<j){
			if(s.charAt(i)==s.charAt(j)) {
				System.out.println("inside if");
				if(ValidPalindrome.isPalindrome(s.substring(i,j+1)))
					return s.substring(i,j+1);
				else
					i++;j--;
			}
			else if(s.charAt(i)==s.charAt(j-1) && i!=j-1) {
				System.out.println("inside else if");
				if(ValidPalindrome.isPalindrome(s.substring(i,j)))
				 	return s.substring(i,j);
				else j--;
			}
			else  {
				System.out.println("inside else ");
				if(ValidPalindrome.isPalindrome(s.substring(i+1,j+1)))
					return s.substring(i+1,j+1);
				else i++;
			}


		}
		return String.valueOf(s.charAt(0));
	}

	/**
	 * Idea -> get mid element (n check for palidrom of substring i-1,i,i+1--> charAt(i-1)==charAt(i+1)--> if true then keep expanding
	 * both sideways n checking
	 * else
	 * divide s, again find mid of both the left and right substring s --> and repeat above step
	 *
	 * @param s
	 * @return
	 */
	public static String longestPalindrome_binarySearchApproach(String s) {
		return longestPalindrome_binarySearchApproach_helper(s,0,s.length()-1);

	}
	private static String longestPalindrome_binarySearchApproach_helper(String s,int start, int end){
		int mid = start+end/2;
		if(start==end)
			return String.valueOf(s.charAt(start));
		if(expandFromCenter(s,start,end))
			return s.substring(start,end+1);
		String s1 =longestPalindrome_binarySearchApproach_helper(s,start,mid-1);
		String s2 =longestPalindrome_binarySearchApproach_helper(s,mid+1,end);

		return  s1.length()>=s2.length()?s1:s2;
	}

	private static boolean expandFromCenter(String s, int start, int end) {
		while(start<end){
			if(s.charAt(start)!=s.charAt(end))
					return false;
			start++;end--;
		}
		return true;
	}


	public static void main(String[] args) {

		System.out.println(longestPalindrome("babad"));
	//	System.out.println(longestPalindrome_binarySearchApproach("cbbd"));
	//	System.out.println(longestPalindrome_binarySearchApproach("babad"));
	}
}
