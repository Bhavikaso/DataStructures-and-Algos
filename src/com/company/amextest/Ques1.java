package com.company.amextest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ques1 {

	public static int solution(String S) {




		int[] newArrayUpper = new int[26];
		int[] newArrayLower = new int[26];
		int len = S.length();
		for (int i = 0; i < len; i++) {
			if(Character.isLowerCase(S.charAt(i)))
				newArrayLower[S.charAt(i)-'a']++ ;
			else
				newArrayUpper[S.charAt(i)-'A']++;
		}

		int startPoint= 0;
		for (int i = 0; i < len ; i++) {
			if(Character.isLowerCase(S.charAt(i))){
				if(newArrayLower[S.charAt(i)-'a'] %2==0)
					startPoint = i;
			}
			else {
				if(newArrayUpper[S.charAt(i)-'A'] %2==0)
					startPoint = i;
			}
		}
		int range = startPoint;

		for (int i = startPoint; i < len; i++) {
			if(newArrayLower[S.charAt(i)-'a'] ==  newArrayUpper[S.charAt(i)-'A'])
				 range++;
		}

		return range-startPoint;



	}


	public static void main(String args[]){
		//int[] arr={8,4,5,0,0,0,0,7};
		//duplicateZeros(arr);
		//System.out.println(digitsManipulations(123456));
		System.out.println(solution("azABaabza"));
	}


}
