package com.company.leetcodeQuestions.greedy;

import java.util.Arrays;

public class CoinChange {
	public int coinChange(int[] coins, int amount) {
		Arrays.sort(coins);
		Arrays.stream(coins).forEach(a-> System.out.println(a));
		int numCoins = 0;
		int summedAmount = 0;
		int highestCoinIndex = 0;
		while (summedAmount <= amount) {
			if (summedAmount == amount)
				return numCoins;
			//pick the next highest coin
			if (summedAmount + coins[highestCoinIndex] > amount)
				highestCoinIndex++;
			else {
				summedAmount = summedAmount + coins[highestCoinIndex];
				numCoins++;
			}

		}

		return -1;
	}
	}
