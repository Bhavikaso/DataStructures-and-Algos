package com.company.javaStuffs.collectionExamples.concurrency;

import java.util.concurrent.Executor;

public class DeadlockExampleMain {

	public static void main(String args[]) throws InterruptedException {
		DeadlockExample obj1 = new DeadlockExample();

		Executor threads;
	/*try {
		threads = Executors.newFixedThreadPool(2);
		threads.execute(() -> {
			int i = 0;

			obj1.increment();
			obj1.decrement();

				}

		);
	}
	catch (Exception e){
	}
	finally {

	}*/

	Thread t1 = new Thread(() -> obj1.increment());

	Thread t2 = new Thread(() -> obj1.decrement());

		t1.start();

		t2.start();


	}
}
