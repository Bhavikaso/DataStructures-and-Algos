package com.company.leetcodeQuestions.cache;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LRUCache extends LinkedHashMap {

	private int capacity;

	public LRUCache(int capacity) {
		super(capacity, 0.75F, true);
		this.capacity = capacity;

	}

	public int get(int key) {
		return (int)super.getOrDefault(key,-1);
	}

	public void put(int key, int value) {
		super.put(key,value);
	}


	@Override
	protected boolean removeEldestEntry(Entry eldest) {
		return size() > capacity;
	}
}
