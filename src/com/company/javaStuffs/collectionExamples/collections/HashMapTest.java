package com.company.javaStuffs.collectionExamples.collections;

import java.util.HashMap;


public class HashMapTest {
	String key;


	public HashMapTest(String key) {
		this.key = key;
	}



	@Override
	public int hashCode(){
		return 10;
	}

	public static void main(String args[]){
		HashMap<String,String> t = new HashMap<>();
		t.put("abc","valueFirst");
		t.put("dif","valueSecond");
		t.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " " + entry.getValue());
		});

	}
}
