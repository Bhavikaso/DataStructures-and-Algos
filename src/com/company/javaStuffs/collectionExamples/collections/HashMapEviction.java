package com.company.javaStuffs.collectionExamples.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*Add capacity
Add items beyond capacity - check wht happens
Add items with same hashcode - check how it trrfies
then remove elemt - check if tree gets back to linkedlist structure

 */

/*Findings --
1. Capacity you gave is 5 , size becomes 8, since the size of table should be power of 2 -- it takes the capacity that you gave
and gets the next power of 2 size - so 8 in this case
threshold becomes 6 (.75% of 8 = 6)
when number of elements added increases 6 (threshold )-- then it doubles the size so beocmes 16 in this case
2. keys are samne - because of overriden equals and hashcode methods -- so every time we put vin map, same key will be there
so values will be overiden. and hence the map will have single key value stored --length will be 1
 */
public class HashMapEviction {



	public static void checkHashMap(){
		Map<Employee,Integer> map = new HashMap<>(5);
		Random rand = new Random(10);
		int i=0;


		while(i<100){
			map.put(new Employee(10,"Bhavika","xyz"), rand.nextInt());
			i++;
		}

	}

	public static void checkEviction() {
		//adding more than 6 elements to exceed threshold
		Map<Integer,Integer> map = new HashMap<>(5);
		int i=0;
		while (i<7){
			map.put(i,i+1);
			i++;
		}
		System.out.println("size of map now "+map.size());


		map.remove(0);
		map.remove(1);

	}

	public static void main(String args[]){

	checkHashMap();
	checkEviction();

}

}
