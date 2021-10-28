package com.company.javaStuffs.collectionExamples.concurrency;

import java.util.LinkedList;

public class ProducerConsumer {

	/* This program will give unpredicted results */

	//shared buffer
	LinkedList<Integer> list = new LinkedList<>();
	int initialCapacity = 100;

	public void producer(){

			if (list.size() == initialCapacity) {
			}
			else {
				list.add(1);
				System.out.println("Produced 1 from Producer, Now the size is " + list.size());
			}

	}

	public void consumer(){

			if (list.isEmpty()) {
			}
			else {
				list.removeFirst();
				System.out.println("Consumed 1 from Consumer, Now the size is " + list.size());
			}

	}





}
