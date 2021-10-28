package com.company.leetcodeQuestions.gSet;

public class LicenseKey {

	public static String licenseKeyFormatting(String s, int k) {
		int counter =0;
		s=s.replaceAll("-","");
		System.out.println(s);
		StringBuilder returnString = new StringBuilder();

		for (int i = s.length()-1; i >=0; ) {
			if(counter==k) {
				returnString.append('-');
				counter=0;
			}
			else {
				returnString.append(Character.toUpperCase(s.charAt(i)));
				counter++;
				i--;
			}


		}
		return returnString.reverse().toString();
	}

	public static void main(String[] args) {
		String s = "5F3Z-2e-9-w";
		System.out.println(licenseKeyFormatting(s,4));
	}
}
