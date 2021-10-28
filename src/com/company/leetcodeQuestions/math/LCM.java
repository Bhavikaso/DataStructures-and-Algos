package com.company.leetcodeQuestions.math;

public class LCM {


	/**
	 * Naive function
	 */

	public static int LCM(int a, int b){
		if(a==0)
			return b;
		if(b==0)
			return a;
		int leastDivisor = a*b;
		int i=1;
		while (i<=leastDivisor){
			if(i%a==0 && i%b==0){
				return i;
			}
			i++;
		}
		return leastDivisor;
	}

	public static int GCD(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;
		int highestDivisor = a * b;
		int i = highestDivisor;
		while (i > 0) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
			i--;
		}
		return highestDivisor;
	}


		/**
		 * Using Eucids algo
		 * @param a,b
		 */
	public int lcm_(int a, int b) {
		return a * b / gcd(a, b);
	}

	public int gcd(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(LCM(531411,262144));
		System.out.println(GCD(2,4));
	}
}
