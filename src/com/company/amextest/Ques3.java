package com.company.amextest;

public class Ques3 {
	public static String solution(String S) {

			StringBuilder stringBuilder = new StringBuilder(S);

			for (int i = 0; i <= S.length()-2; i++) {
				if(stringBuilder.charAt(i)=='?' && stringBuilder.charAt(i+1)=='?')
				{
					if(i==0){
						if( stringBuilder.charAt(i+2)=='a'){
							stringBuilder.setCharAt(i, 'b');
							stringBuilder.setCharAt(i+1, 'a');
						}
						else {
							stringBuilder.setCharAt(i, 'a');
							stringBuilder.setCharAt(i+1, 'b');
						}
					}
					else if((stringBuilder.charAt(i-1)=='a' && stringBuilder.charAt(i+2)=='a')){
						stringBuilder.setCharAt(i, 'b');
						stringBuilder.setCharAt(i+1, 'b');
					}
					else if((stringBuilder.charAt(i-1)=='b' && stringBuilder.charAt(i+2)=='b')){
						stringBuilder.setCharAt(i, 'a');
						stringBuilder.setCharAt(i+1, 'a');
					}
					else if((stringBuilder.charAt(i-1)=='a' && stringBuilder.charAt(i+2)=='b')){
						stringBuilder.setCharAt(i, 'b');
						stringBuilder.setCharAt(i+1, 'a');
					}
					else {
						stringBuilder.setCharAt(i, 'a');
						stringBuilder.setCharAt(i+1, 'b');
					}
				}
				if(stringBuilder.charAt(i)=='?' && stringBuilder.charAt(i+1)!='?')
				{
					if((stringBuilder.charAt(i-1)=='a' && stringBuilder.charAt(i+1)=='a')){
						stringBuilder.setCharAt(i, 'b');
					}
					if((stringBuilder.charAt(i-1)=='b' && stringBuilder.charAt(i+1)=='b')){
						stringBuilder.setCharAt(i, 'a');
					}
					if((stringBuilder.charAt(i-1)=='a' && stringBuilder.charAt(i+1)=='b') ) {
						stringBuilder.setCharAt(i, 'a');

					}
					else if (stringBuilder.charAt(i-1)=='b' && stringBuilder.charAt(i+1)=='a') {
						stringBuilder.setCharAt(i, 'b');
					}



				}


			}
			return stringBuilder.toString();
		}



	public static void main(String args[]){
		//int[] arr={8,4,5,0,0,0,0,7};
		//duplicateZeros(arr);
		//System.out.println(digitsManipulations(123456));
		System.out.println(solution("a?b?aa"));

	}
}
