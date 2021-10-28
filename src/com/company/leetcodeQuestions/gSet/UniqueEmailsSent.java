package com.company.leetcodeQuestions.gSet;

/*https://leetcode.com/explore/interview/card/google/67/sql-2/3044/*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class UniqueEmailsSent {

	public int numUniqueEmails(String[] emails) {
		Set<String> set = new HashSet<>();

		for (String s:emails) {
			String[] splitStrArr = s.split("@");
			String first=splitStrArr[0];
			String last = splitStrArr[1];
			if(first.contains("+")){
				first=first.substring(0,first.indexOf("+"));
			}
			if(first.contains(".")){

				first= first.replace(".","");
			}
			set.add(first+"@"+last);

		}

		return set.size();
	}
}
