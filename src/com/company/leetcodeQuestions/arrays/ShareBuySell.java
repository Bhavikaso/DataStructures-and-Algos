package com.company.leetcodeQuestions.arrays;

public class ShareBuySell {

	public static int maxProfit(int[] prices) {
		//buy from the day when there is min val
		int   maxProfit=0;

		int i=0;
		int peak=0,valley=0;
		while(i<prices.length-1){
			while (i<prices.length-1 && prices[i]>=prices[i+1])
				i++;
			valley=prices[i];
			while (i<prices.length-1 && prices[i]<=prices[i+1])
				i++;
			peak=prices[i];
			maxProfit=maxProfit+peak-valley;

		}

		return maxProfit;
	}


	public static void main(String args[]){
		int[] arr={1,2,3,4,5};
		System.out.println(maxProfit(arr));

	}
}
