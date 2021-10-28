package com.company.leetcodeQuestions.gSet.mocktest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongPressedKeyProblem {

	public static boolean isLongPressedName(String name, String typed) {
		/*StringBuilder nameRegrexString = new StringBuilder(name);
		nameRegrexString.in
		for (int i = 1; i < nameRegrexString.length()-2; i++) {*/

		name = name.replaceAll(".(?!$)","$0+").concat(""
				+ "+");

		System.out.println("name"+name);
		final Pattern pattern = Pattern.compile(name);
		final Matcher matcher = pattern.matcher(typed);
		if(matcher.matches())
			return true;
		else
			return false;



	}

	public static void main(String[] args) {
		isLongPressedName("vtkgn","vttkgnn");
	}
}
