package com.company.javaStuffs.collectionExamples.concurrency;

/* Usage of wait and notify*/

import java.util.LinkedList;

public class ProducerConsumerImproved {
	LinkedList<Integer> list = new LinkedList<>();
	int initialCapacity = 100;

	public void producer() throws InterruptedException {
		synchronized (this) {
			if (list.size() == initialCapacity) {
				wait();
			}
			else {
				list.add(1);
				notify();
				System.out.println("Produced 1 from Producer, Now the size is " + list.size());
			}
		}

	}

	public void consumer() throws InterruptedException {
		synchronized (this) {
			if (list.isEmpty()) {
				wait();
			}
			else {
				list.removeFirst();
				notify();
				System.out.println("Consumed 1 from Consumer, Now the size is " + list.size());
			}
		}
	}

}
