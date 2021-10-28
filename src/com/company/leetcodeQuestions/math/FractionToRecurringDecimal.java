package com.company.leetcodeQuestions.math;

import java.math.BigDecimal;
import java.math.MathContext;

public class FractionToRecurringDecimal {

	public static String fractionToDecimal(int numerator, int denominator) {
		StringBuilder ans= new StringBuilder();
		String divident = String.valueOf(numerator);
		for(int i=divident.length();i>=0;i--){
			int val = divident.charAt(i);
			int quotient = divident.charAt(i)/denominator;
			int remainder = divident.charAt(i)%denominator;
			ans.append(String.valueOf(val));

			if(remainder< quotient){

			}
		}
		return null;
	}

	public static void main(String[] args) {
		fractionToDecimal(2,3);
		fractionToDecimal(4,3333);
	}
}
