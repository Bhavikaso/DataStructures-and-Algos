package com.company.leetcodeQuestions.gSet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MultiplyString {

	public static String multiply(String num1, String num2) {
		/*int carry=0;

		int topLen , bottomLength;
		if(num1.length()>num2.length()) {
			topLen = num1.length();
			bottomLength=num2.length();
		}
		else {
			topLen = num2.length();
			bottomLength=num1.length();
		}

		//2d array
		int [][] data = new int [bottomLength][topLen+1];

		int num1L = num1.length();
		int num2L =num2.length();

		StringBuilder ans = new StringBuilder();
		for (int j=num2L-1; j>=0;j--){


			for (int i =num1L-1;i>=0;i--) {
				int val = ((num1.charAt(i)-'0')* (num2.charAt(j)-'0')) + carry;
				if (val > 9 && i != 0) {
					val = val / 10;
					carry = val % 10;
				}
				if (i == num1L - 1) {
					ans.append(val);
				}
				else {
					data[j][i] = val;
				}

			}
		}

		carry=0;
		for (int i = data[0].length-1; i >= 0; i--) {
			int sum = 0;
			for (int j = data.length-1; j >=0; j--) {
				sum += data[j][i]+carry;
				carry=0;
			}
			if(sum>9) {
				sum = sum / 10;
				carry = sum % 10;
			}
			ans.append(sum);

		}
		return (ans.reverse()).toString().replaceFirst("^0+(?!$)", "");*/

		int m = num1.length(), n = num2.length();
		int[] pos = new int[m + n];

		for(int i = m - 1; i >= 0; i--) {
			for(int j = n - 1; j >= 0; j--) {
				int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int p1 = i + j, p2 = i + j + 1;
				int sum = mul + pos[p2];

				pos[p1] += sum / 10;
				pos[p2] = (sum) % 10;
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
		return sb.length() == 0 ? "0" : sb.toString();

	}

	public static void main(String[] args) {
		System.out.println(multiply("23","24"));

	}

}
