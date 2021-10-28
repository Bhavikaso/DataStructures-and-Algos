package com.company.twilio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques2 {

	public static List<String> processLogs(List<String> logs, int threshold) {
		List<String> sR = new ArrayList();
		Map<String,Integer> map = new HashMap<>();
		for (String s: logs) {
			String arr[] = s.split(" ");
			sR.add(arr[0]);
			sR.add(arr[1]);
		}

		for (String s :sR) {
			if(!map.containsKey(s)){
				map.put(s,1);
			}
			else {
				int val = map.get(s);
				map.put(s,++val);
			}
		}

		//sort map values
		List<String> resultList= map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue()).filter(stringIntegerEntry -> stringIntegerEntry.getValue()>=threshold).map(e-> e.getKey())
				.collect(Collectors.toList());

		Collections.sort(resultList);
		return resultList;


	}
	public static void main(String args[]){
		String string= "leetcode";
		//System.out.println(firstUniqChar(string));

	}
}
