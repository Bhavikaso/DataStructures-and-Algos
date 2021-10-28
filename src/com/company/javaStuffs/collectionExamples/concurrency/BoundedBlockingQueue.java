package com.company.javaStuffs.collectionExamples.concurrency;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/*
When using synchronozed --> use objects monitor functions -- wait(), notify()
When using locks -> use conditions functions -- await and signal

 */
public class BoundedBlockingQueue {

	LinkedList<Integer> blockingQueue = new LinkedList();;
	int capacity;
	Lock lock = new ReentrantLock();
	Condition full = lock.newCondition();
	Condition empty = lock.newCondition();

	public BoundedBlockingQueue(int capacity) {
		this.capacity=capacity;
	}

	public void enqueue(int element) throws InterruptedException {
		lock.lock();
		try {
			while (blockingQueue.size() == capacity)
				full.await();

			blockingQueue.addFirst(element);
			System.out.println("The producer thread enqueues %d to the queue." + element);
			empty.signal();

		}
		finally {
			lock.unlock();
		}

	}

	public int dequeue() throws InterruptedException {
		int element = 0;
		lock.lock();
		try {
			while (blockingQueue.size() == 0) {
				System.out.println("Since the queue is empty, the consumer thread is blocked.");
				empty.await();
			}

			element = blockingQueue.removeLast();
			System.out.println("The consumer thread calls dequeue and returns %d from the queue." + element);
			full.signal();

			return element;
		}
		finally {
			lock.unlock();
		}


	}

	public int size() {
		lock.lock();
		try {
			return blockingQueue.size();
		}
		finally {
			lock.unlock();
		}

	}

}
