package com.company.leetcodeQuestions.gSet;

public class FindReplace {

	public String findReplaceString(String s, int[] indexes, String[] sources, String[] targets) {
		int i;
		//StringBuilder stringBuilder=new StringBuilder(s);

		for (i = 0; i < indexes.length; i++) {
			CharSequence cs = s.substring(indexes[i],indexes[i]+sources[i].length());
			if((s.substring(indexes[i],indexes[i]+sources[i].length()).equals(sources[i]))) {
				//replace
				//CharSequence csT=targets[i];
				s.replace(cs,targets[i]);
			}
		}
		return s;
	}
}
