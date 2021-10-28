package com.company.interviewBitQuestions.string;

public class PalindromeString {

	public boolean isPalindrome(String str){
		int i = 0, j=str.length()-1;
		while (i != j ) {
			if(isAlphanumeric(str.charAt(i))){
				if (isAlphanumeric(str.charAt(j)))
				{
					System.out.println("Both i and j are alphanumeric "+i+" "+j);
					if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
						return false;
					}
					else {
						i++;
						j--;
					}
				}
				else {
					j--;
				}

			}
			else {
				i++;
			}

		}
		return true;
	}


	public boolean isAlphanumeric(char c ){
		if((c>=97 && c<=122) || c>=65 && c<=90 ){
			return true;
		}
		return false;
	}
}
