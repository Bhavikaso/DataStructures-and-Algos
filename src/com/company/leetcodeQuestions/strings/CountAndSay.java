package com.company.leetcodeQuestions.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountAndSay {
	public static String countAndSay(int n){
		if(n==0)
			return null;
		if(n==1)
			return "1";
		StringBuilder str = new StringBuilder("11");
		return countAndSayHelper(str,2,n).toString();
	}

	public static StringBuilder countAndSayHelper(StringBuilder str, int start, int n) {
		  if(start==n)
		  	return str;

		  int count=1; //to count num of occurence of single digit
		  int j=0;    // pointer to index of next unique elemnt
		  int i=1;   // pointer to count the similar digits
		while(j<str.length() ) {
			while (i<str.length()  && str.charAt(j) == str.charAt(i)) {  //increment till similar digits
				count++;
				i++;
			}

			str.delete(j, i - 1);  // delete similar digits from j to i-1 --> This deletes from j to i-2
			str.insert(j, count);  // insert the count to jth place

			j=i+1-(count-1);     // next jth value is i+1,minus similar digit counts that we deleted
			i=j+1;  			//  next ith index to compare similar digits
			count=1;			//count back to 1

		}

		return countAndSayHelper(str,start+1, n);
	}

	public static void main(String[] args) {
		System.out.println(countAndSay(7));
		System.out.println("abcde".replaceAll("","*"));

	}
}
