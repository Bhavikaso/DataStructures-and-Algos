package com.company.javaStuffs.collectionExamples.concurrency;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockExample {

	//shared varable
	int counter=0;

	//two locks
	//Object lock1= new Object();
	//Object lock2 = new Object();
	Lock lock1 = new ReentrantLock(true);
	Lock lock2 = new ReentrantLock(true);

	int i=0;

	//increment
	void increment(){
		lock1.lock();
			System.out.println("Acquired lock1 from increment");
			lock2.lock();
				System.out.println("Acquired lock2 from increment");
				while(i<5){
				counter++;
				System.out.println("counter increased "+counter);
				i++;}
			lock2.unlock();
		lock1.unlock();
	}

	void decrement(){
		lock2.lock();
			System.out.println("Acquired lock2 from decrement");
			lock1.lock();
				System.out.println("Acquired lock1 from decrement");
				while(i>=1){
				counter--;
				System.out.println("counter decreased "+counter);
				i--;
				}
			lock1.unlock();
		lock2.unlock();

	}





}
