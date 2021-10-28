package com.company.leetcodeQuestions.strings;

public class StringToInteger {
	public static int myAtoi(String s) {
		int index=0;
		int sign =1;
		int total=0;
		if(s.length()==0) return 0;

		while (s.charAt(index)==' '&& index<s.length()) {index++;}

		if(s.charAt(index)=='+'|| s.charAt(index)=='-'){
			sign=s.charAt(index)=='+'?1:-1;
			index++;
		}

		while(index<s.length()) {
			int digit = s.charAt(index) - '0';
			if (digit < 0 || digit > 9) break;

			//check for overflow
			if ((Integer.MAX_VALUE / 10 < total) || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

			total = total * 10 + digit;
			index++;
		}
		return total*sign;

	}

	public static void main(String[] args) {
		System.out.println(myAtoi("-91283472332"));
	}
}
