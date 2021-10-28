package com.company;

import com.company.basics.ArrayOperations;
import com.company.basics.StringOperations;
import com.company.designPatterns.SingletonPattern;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayOperations arrayOperations = new ArrayOperations();
        StringOperations stringOperations = new StringOperations();
        Integer arr[] = {7, 1, 3, 2, 4, 5, 6};

        int arr2d[][] = {{1, 5, 3},
        {4, 8, 7},
        {6, 9, 1}};
        /*ArrayOperations arrayOperations = new ArrayOperations();
        Integer[] arr = {3,7,5,2,8,0,1};
        arrayOperations.indexesOfSummedNumbers(arr);*/

        //SingletonPattern.callRuntimeMethod();

        /*StringOperations stringOperations = new StringOperations();
        stringOperations.validateString("aebaecedabbee");*/

        //leftRotation
        /*ArrayOperations arrayOperations = new ArrayOperations();
        int arr[] = {1, 2, 3, 4, 5};
        arrayOperations.leftRotation(4, arr );*/

        /*StringOperations stringOperations = new StringOperations();
        System.out.println(stringOperations.duplicateValuesInString("bhavikabhav"));*/


       /* int count = arrayOperations.minSwapUSingGreedyApproach(arr);
        System.out.println(count);*/

        System.out.println(arrayOperations.arrayManipulation(arr2d,3));

        System.out.println(stringOperations.commonSubString("hello","world"));




    }
}
