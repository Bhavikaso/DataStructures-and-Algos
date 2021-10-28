package com.company.javaStuffs.collectionExamples.collections;

import java.util.HashMap;

/* because of the line ((k = first.key) == key || (key != null && key.equals(k)))) in hashmap,
first keys value are compared by == operator.. if they are equal it returns the value.
Since the reference s same, value associated with e1 is returned
 */
public class HashMapTesMain {

	public static void main(String args[]){
		Employee e1 = new Employee(10,"Bhavika","xyzAddress");

		HashMap<Employee,String> h1 = new HashMap<>();
		h1.put(e1,"guddan");
		e1.setName("Ankit");
		System.out.println(h1.get(e1));

	}
}
