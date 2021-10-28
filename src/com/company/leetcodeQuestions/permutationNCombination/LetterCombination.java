package com.company.leetcodeQuestions.permutationNCombination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {

	public List<String> letterCombinations(String digits) {

		Map<Integer,String> map = createMap();




		return new ArrayList<>();
	}

	private Map<Integer,String> createMap() {
		Map<Integer,String> map = new HashMap<>();
		map.put(2,"abc");
		map.put(3,"def");
		map.put(4,"ghi");
		map.put(5,"jkl");
		map.put(6,"mno");
		map.put(7,"pqrs");
		map.put(8,"tuv");
		map.put(9,"wxyz");
		return map;

	}

}
