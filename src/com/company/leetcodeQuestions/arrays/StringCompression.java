package com.company.leetcodeQuestions.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/string-compression/
 */
public class StringCompression {

	public int compress(char[] chars) {
			/*Map<Character,Integer> freq = new HashMap<>();
			for (int i = 0; i < chars.length; i++) {
				freq.put(chars[i],freq.getOrDefault(chars[i],0)+1);
			}

			int j=0;
			StringBuilder sb = new StringBuilder();
			freq.forEach((k,v)->{
				sb.append(k);
			if(v>1)
				sb.append(v);
	});

			for (char c :sb.toString().toCharArray())
				chars[j++]=c;

			return j;*/
		/*int i=0;
		int count=0;
		StringBuilder sb = new StringBuilder();
		for ( ; i < chars.length-1; i++) {
			if (chars[i] == chars[i + 1])
				count++;
			else {
				sb.append(chars[i]);
				sb.append(count);
				count = 0;
			}
		}*/
		return 0;

	}
}
