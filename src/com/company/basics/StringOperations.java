package com.company.basics;

import java.util.Arrays;
import java.util.HashSet;

public class StringOperations {

    /* Problem
    https://practice.geeksforgeeks.org/problems/minimum-changes-to-make-all-substrings-distinct/0
     */
    public void validateString (String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int count=0;
        for (int i=0;i<arr.length-1;i++)
        {

            if(arr[i]==arr[i+1])
                count++;

        }
        System.out.println("count"+ count);
    }


    public boolean duplicateValuesInString(String s)
    {
        int countDups = 0;
        char[] charArr = s.toCharArray();
        HashSet<Character> charSet = new HashSet<>();
        Arrays.sort(charArr);

        for (int i=0;i<charArr.length-1;i++) {
           if(charArr[i]==charArr[i+1])
               return true;

        }
        return false;
    }

    public String commonSubString(String s1, String s2){
        int len=0;
        boolean returnVal = false;
        String smallString=null, largeString=null;

        if(s1.length()>s2.length()) {
            Arrays.sort(s1.toCharArray());
            len = s2.length();
            smallString = s2;
            largeString=s1;


        }
        else {
                Arrays.sort(s2.toCharArray());
                len = s1.length();
                smallString = s1;
                largeString=s2;
            }

        char[] smallArray = smallString.toCharArray();
        char[] largeArray = largeString.toCharArray();

        for (char c :smallArray) {
            if(Arrays.binarySearch(largeArray,c)>0){
                returnVal=true;
            }

        }

        if (returnVal==true)
            return "YES";
        else
            return  "NO";

    }
}
