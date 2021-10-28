package com.company.leetcodeQuestions.math;

import java.util.LinkedList;
import java.util.List;

public class FractionAdditonSubtraction {

	/**
	 * idea ->
	 * @param expression
	 * @return
	 */
	public static String fractionAddition(String expression) {


		List<Integer> numerator = new LinkedList();
		List<Integer> denominator = new LinkedList();
		List<Character> operator = new LinkedList();
		int sign=1;
		int i = 0;
		if(expression.charAt(0)=='-') {
			sign = -1;
			i=1;
		}
		for (; i < expression.length(); i++) {
			if (i>0 && expression.charAt(i) == '+' || expression.charAt(i) == '-'){
				operator.add(expression.charAt(i));
			}
			if (expression.charAt(i)-'0' >=0 &&  expression.charAt(i)-'0' <= 10){
				if(i==expression.length()-1)
					denominator.add(expression.charAt(i ) - '0');
				else if(expression.charAt(i+1)=='/') {
					if(i==1) {
						int val = expression.charAt(i)- '0';
						val =val*sign;
						numerator.add(val);
					}
					else
						numerator.add(expression.charAt(i) - '0');
				}
				else
					denominator.add(expression.charAt(i) - '0');
			}

		}
		int j=2;
		int lcm = LCM.LCM(denominator.get(0),denominator.get(1));
		while(j<denominator.size())
			lcm=LCM.LCM(lcm,denominator.get(j++));
		int k=1;
		int l=0;
		int sum=numerator.get(0)*(lcm/denominator.get(0));
		while (k<numerator.size()) {
			if(operator.get(l)=='+')
				sum=sum+numerator.get(k)*(lcm/denominator.get(k));
			else
				sum=sum-numerator.get(k)*(lcm/denominator.get(k));
			k++;l++;
		}
		int divisor = LCM.GCD(Math.abs(sum),lcm)	;
		int num = (sum/divisor);
		int den= lcm/divisor;
		return num+"/"+den;

	}

	public static void main(String[] args) {
		System.out.println(fractionAddition("-5/2+10/3+7/9"));
	}
}
