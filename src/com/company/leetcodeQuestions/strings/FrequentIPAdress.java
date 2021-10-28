package com.company.leetcodeQuestions.strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FrequentIPAdress {

	public String findFrequentIPAdress(List<String> logs){
		Pattern p = Pattern.compile("[\\d]+.[\\d].[\\d].[\\d]");
		Map<String,Integer> map = new HashMap<>();
		int max=Integer.MIN_VALUE;



		logs.forEach(l->{
			Matcher m = p.matcher(l);
			if(m.matches()) {
				if (map.containsKey(m.group())) {
					int val = map.get(m.group());
					map.put(m.group(), val++);
				}
				else
					map.put(m.group(), 1);
			}



		});
		return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
	}
}
