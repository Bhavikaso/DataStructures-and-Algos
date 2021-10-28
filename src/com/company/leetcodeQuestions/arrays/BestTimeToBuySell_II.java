package com.company.leetcodeQuestions.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BestTimeToBuySell_II {
	public int maxProfit(int[] prices) {



		int maxP=0;
		for (int i = 1; i < prices.length; i++) {
			if(prices[i]>prices[i-1])
				maxP=maxP+prices[i]-prices[i-1];

		}

		return maxP;

	}
}
