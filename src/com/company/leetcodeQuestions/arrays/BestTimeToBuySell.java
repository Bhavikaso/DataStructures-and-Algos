package com.company.leetcodeQuestions.arrays;

public class BestTimeToBuySell {
	public static int maxProfit(int[] prices) {
		/*int maxprofit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1])
				maxprofit += prices[i] - prices[i - 1];
		}
		return maxprofit;*/

		int buyPrice = prices[0];
		int sellPrice = 0;

		for(int eachday =1 ;eachday<prices.length ;eachday++){
			if(prices[eachday]>prices[eachday-1]){
				if(sellPrice<prices[eachday])
					sellPrice=prices[eachday];
			}
			else{
				if(buyPrice>prices[eachday])
					buyPrice=prices[eachday];
			}

		}

		return sellPrice-buyPrice;

	}



	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));

	}
}
