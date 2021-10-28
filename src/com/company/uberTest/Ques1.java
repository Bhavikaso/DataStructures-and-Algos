package com.company.uberTest;

public class Ques1 {
	static int digitsManipulations(int n) {
		int product =1, sum =0;
		int temp=n;
		while(temp>0){
			int mod = temp%10;
			temp=temp/10;
			product= product* mod;
			sum=sum+mod;
		}
		return product-sum;

	}


	public static void main(String args[]){
		//int[] arr={8,4,5,0,0,0,0,7};
		//duplicateZeros(arr);
		System.out.println(digitsManipulations(123456));
	}
}
