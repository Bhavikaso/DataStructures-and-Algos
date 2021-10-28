package com.company.uberTest;

public class Ques2 {
	boolean composeKPalindromes(String s, int k) {
		int len = s.length();
		int[] newArray = new int[26];
		int count = 0;
		for (int i = 0; i < len; i++) {
			newArray[s.charAt(i)-'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if(newArray[i]%2!=0)
				count++;
		}
		if(k<count || k>len) return false;
		return true;
	}

	public static void main(String args[]){
		int[] arr={8,4,5,0,0,0,0,7};
		//duplicateZeros(arr);
	}
}
