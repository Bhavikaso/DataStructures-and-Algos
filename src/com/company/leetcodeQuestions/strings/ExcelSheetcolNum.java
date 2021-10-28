package com.company.leetcodeQuestions.strings;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetcolNum {

	/**
	 * 26+A*26 +B*26 +c*26...
	 */

	public int titleToNumber(String columnTitle) {

		/*Map<Character,Integer> letters = new HashMap<>();
		for(int i=0;i<letter;i++)
			letters.put('A'-i,i+1);*/


		int colNum=(columnTitle.charAt(columnTitle.length()-1)-'A'+1);

		for(int i=columnTitle.length()-2,j=1;i>=0;i--,j++){
			System.out.println("col num before "+colNum);
			colNum=  (colNum+(columnTitle.charAt(i)-'A'+1)*(int)(Math.pow(26,j)));
			System.out.println("col num after "+colNum);

		}


		return colNum;
	}
}
