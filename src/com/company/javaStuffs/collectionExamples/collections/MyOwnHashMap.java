package com.company.javaStuffs.collectionExamples.collections;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyOwnHashMap<K,V> extends AbstractMap implements Map {

	/*----------defaukt fields-------------*/
	final int INITIAL_CAPACITY = 1<<4; //16 -- 2^4

	final int MAXIMUM_CAPACITY = 1<<30; //16 -- 2^30

	final float LOAD_FACTOR = 0.75f;


	/*-------fields-------------------------*/
	transient Node<K,V> [] table;


	//int threshold = ;
	/*--------internal classes----------------*/
	static class Node<K,V> implements Map.Entry<K,V>{
		final K key ;
		V value;
		int hash;
		Node<K,V> next;

		public Node(K key, V value, int hash, Node<K, V> next) {
			this.key = key;
			this.value = value;
			this.hash = hash;
			this.next = next;
		}
		@Override
		public K getKey() {
			return key;
		}

		@Override
		public V getValue() {
			return value;
		}

		@Override
		public V setValue(V value) {
			return this.value=value;
		}
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		return false;
	}

	@Override
	public Object get(Object key) {
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		if(table.length==INITIAL_CAPACITY){
			//increase table size
		}
		return null;
	}

	@Override
	public Object remove(Object key) {
		return null;
	}

	@Override
	public void putAll(Map m) {

	}

	@Override
	public void clear() {

	}

	@Override
	public Set keySet() {
		return null;
	}

	@Override
	public Collection values() {
		return null;
	}

	@Override
	public Set<Entry> entrySet() {
		return null;
	}

	//array of linkedList



}
