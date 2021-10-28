package com.company.leetcodeQuestions.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String,List<String>> map = new HashMap<>();
		Arrays.stream(strs).forEach(s -> {
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			String str = String.valueOf(arr);

			if(map.containsKey(str))
				map.get(str).add(s);
			else {
				List<String> list = new ArrayList();
				list.add(s);
				map.put(str, list);
			}
		});
		return map.values().stream().collect(Collectors.toList());
	}

	private static int asciiTotalOfWord(String s) {
		int tot=0;
		for (int i = 0; i < s.length(); i++) {
			tot+=s.charAt(i)-'a'+1;
		}
		return tot;
	}

	public static void main(String[] args) {
		String[] arr={"ac","c"};
		groupAnagrams(arr).stream().flatMap(List::stream).collect(Collectors.toList()).forEach(s-> System.out.println(s));
	}
}
