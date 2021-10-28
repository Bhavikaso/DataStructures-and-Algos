package com.company.basics;

import javax.swing.*;
import java.sql.Time;
import java.time.LocalTime;
import java.util.*;

public class ArrayOperations {

    public void sumOfArrayElements(int arr[]) {
        // int sum = 0;


    }

    public void rotateArrayElements() {

    }

    public void indexesOfSummedNumbers(Integer[] arr) {

        List<Integer> arrAsList = Arrays.asList(arr);
        Collections.sort(arrAsList);

        for (int i = 0; i <= arrAsList.indexOf(7); i++) {

            if (arrAsList.contains(Math.abs(7 - arrAsList.get(i)))) {
                Integer indexOfSecondvalue = Math.abs(7 - arrAsList.get(i));
                System.out.println(i + " " + arrAsList.indexOf(indexOfSecondvalue));
            }
        }


    }

    /*
    https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
     */
    public void leftRotation(int k, int arr[]) {
        int size = arr.length;
        int[] newArr = new int[size];
        int rightShift = size - k;
        int d;
        if (size > k) {
            d = size - k;
        } else {
            d = k;
        }

        /*Arrays.stream(arr).forEach( i->
                {
                    i-=1;
                    int newLoc = i+d % size;
                    System.out.println("d"+d);
                    System.out.println(newLoc);
                    newArr[newLoc+1]= arr[i];
                }

        );*/

        for (int i = 0; i < size; i++) {
            int newLoc = (i + d) % size;
            newArr[newLoc] = arr[i];
        }

        Arrays.stream(newArr).forEach(num -> System.out.println(num));
    }

    /*https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays*/
    /*the sequence will alaways start from 1 and are consecutive numbers, so we can apply this - count the number of elements on its misplaced position and then -1 */
    //max displaced num - piority queue
    //interchange wid second max displaced num (only if this is aligned wid sorted seq) -> check this by seeing if interchanging reduces there displaced value)


    /*public int[] MinSwap2(int[] arr, int start, int end, int swap) {
        //int count= (int) Arrays.stream(arr).filter(i -> arr[i] != i).count();
       *//* int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1){
                count++;
            }
        }
        System.out.println(count-1);*//*

     *//* if (clearList(arr, start, end)) {
            System.out.println("swap"+swap);
            return swap;
        }
        if(start==end){
            System.out.println("swap"+swap);
            return swap;
        }*//*
       if(start<end){

            int mid = (start + end) / 2;
            if (arr[start] > arr[mid]) {
                int temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                swap++;
            }
            int[] arr1=null,arr2=null;
            if (!clearList(arr, start, mid)) {
                arr1= MinSwap2(arr, start, mid, swap);
            }
            else{
                arr1=getArray(arr,start,mid);
            }
            if(!clearList(arr, mid + 1, end)){
                arr2 = MinSwap2(arr, mid + 1, end, swap);
            }
            else{
                arr2=getArray(arr,mid + 1, end);
            }
           return mergeArray(arr1,arr2);

        }
        System.out.println(swap);
        return null;

    }*/

    public int minSwapUSingGreedyApproach(Integer[] arr) {
     /*  Map<Integer,Integer> displacedOrderMap = new  HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            displacedOrderMap.put(i,Math.abs(i-arr[i]));
        }
        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<>(displacedOrderMap.entrySet());


        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {
            @Override
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
                return (o2.getValue().compareTo(o1.getValue()));
            }
        });
        displacedOrder.
        TreeSet<Integer> integerTreeSet = new TreeSet<>(new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1.intValue()>o2.intValue()){
                    return -1;
                }
                else if(o1.intValue()<o2.intValue()){
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });



        integerTreeSet.addAll(Arrays.asList(arr));
*/
        int swapCount = 0;
     /*TreeMap<Integer,Integer>  treeMap = new TreeMap<>();
     for (int i = 0; i < arr.length; i++) {
         treeMap.put(Math.abs(i-arr[i]),arr[i]);
     }
     while (treeMap.lastEntry().getKey()!=treeMap.lastEntry().getValue()) {
         Map.Entry<Integer, Integer> highest = treeMap.lastEntry();
         Map.Entry<Integer, Integer> secondHighest = treeMap.floorEntry(highest.getKey());

         if (highest.getValue() < secondHighest.getValue()) {
             int temp = highest.getValue();
             treeMap.put(highest.getKey(), secondHighest.getValue());
             treeMap.put(secondHighest.getKey(), temp);
             swapCount++;
         }
     }*/
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], Math.abs(i + 1 - arr[i]));
        }

        Map.Entry<Integer, Integer> maxDispacement = null, secondMaxDisplacement = null;

        do {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (visited[entry.getKey() - 1] == false) {
                    if (maxDispacement == null || entry.getValue().compareTo(maxDispacement.getValue()) > 0) {
                        maxDispacement = entry;
                    }
                }
            }
            visited[maxDispacement.getKey() - 1] = true;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (visited[entry.getKey() - 1] == false) {

                    if (entry.getValue().compareTo(maxDispacement.getValue()) < 0 && (secondMaxDisplacement == null || entry.getValue().compareTo(secondMaxDisplacement.getValue()) > 0)) {
                        secondMaxDisplacement = entry;
                    }
                }
            }
            visited[secondMaxDisplacement.getKey() - 1] = true;

            if (maxDispacement.getKey() > secondMaxDisplacement.getKey()) {
                int temp = maxDispacement.getValue();
                map.put(maxDispacement.getKey(), secondMaxDisplacement.getValue());
                map.put(secondMaxDisplacement.getKey(), temp);
                swapCount++;
            }
            //get highest and second highest displacement values
        } while (maxDispacement.getKey() != 0);
        return swapCount;
    }


    private int[] getArray(int[] arr, int start, int end) {
        int[] newAr = new int[end + 1];
        int k = 0;
        for (int i = start; i < end + 1; i++) {
            newAr[k] = arr[i];
            k++;
        }
        return newAr;
    }

    private int[] mergeArray(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        int k = 0;
        int[] ar = new int[l1 + l2];
        for (int i = 0; i < l1; i++) {
            ar[k] = arr1[i];
            k++;
        }
        for (int i = l1; i < l2; i++) {
            ar[k] = arr2[i];
            k++;
        }
        return ar;

    }

    boolean clearList(int[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                return false;
            }

        }
        return true;
    }

    private void swapHelper(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    /*https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays*/
    public int hourGlassProblem(int[][] arr) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                integerTreeSet.add(arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
            }
        }
        return integerTreeSet.last();
    }

    /*https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays*/
    public int arrayManipulation(int[][] arr, int m){
        LocalTime ltStart = LocalTime.now();

        int maxArrayLength =0;
        int maxValue=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>maxArrayLength){
                    maxArrayLength=arr[i][j];
                }
            }

        }
        int[] arrNew = new int[maxArrayLength];


        for (int numOfOperations = 0; numOfOperations < m; numOfOperations++) {
            for (int j = 0; j < arrNew.length; j++) {
                if (j >= arr[numOfOperations][0]-1 && j <= arr[numOfOperations][1]-1) {
                    arrNew[j] = arrNew[j] + arr[numOfOperations][2];
                    if(arrNew[j] > maxValue){
                        maxValue=arrNew[j];
                    }
                }


            }
        }
        LocalTime ltEnd = LocalTime.now();
        //System.out.println(ltEnd.minus(ltStart);
        return maxValue;
    }
}
