package com.company.leetcodeQuestions.strings;

import java.util.Arrays;

/**
 * Time complexity - O(N) to swap N/2 elements
 * Space complexity -O(N) for recursive solution; O(1) for iterative solution
 */
public class ReverseString {

	public static void reverseString(char[] s) {
		//helper(s,0);
		helper(s,0,s.length-1);
		System.out.println(Arrays.toString(s));
	}

	public static void helper(char[] s, int start, int end){
		if(start==end){
			return;
		}
		else{
			char temp = s[start];
			s[start]=s[end];
			s[end]=temp;
			helper(s,start+1,end-1);
			//System.out.print("\""+s[index]+"\",");
		}
	}

	public static void main(String args[]){
		char [] string= {'h','e','l','l','o'};
		reverseString(string);

	}


}
