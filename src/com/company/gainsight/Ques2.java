package com.company.gainsight;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Ques2 {
	public static String minMaxSum(int n, int[] arr){
		int max = 1<<n, res=0;
		int maxSum=Integer.MIN_VALUE, minSum=Integer.MAX_VALUE;
		for(int i=1;i<max;i++){
			int xor =0;
			for(int j=0;j<n;j++){
				int val = i & (1<<j);
				System.out.println("val"+val);
				if(val !=0)
					xor^=arr[j];

			}
			System.out.println("xor"+xor);


			res+=xor;
			if(res>maxSum)
				maxSum=res;
			if(res<minSum)
				minSum=res;
		}
		return (maxSum+"  "+minSum);
	}
	public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
		//Scanner
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();                 // Reading input from STDIN
		System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

		int n = Integer.parseInt(s.nextLine());
		/*int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(s.nextLine());
		}*/

		int[] arr ={1,2,3,4};

		minMaxSum(4,arr);




	}

}
