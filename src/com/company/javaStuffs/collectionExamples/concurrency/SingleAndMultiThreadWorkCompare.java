package com.company.javaStuffs.collectionExamples.concurrency;

public class SingleAndMultiThreadWorkCompare {
	long startRange;
	long endRange;
	int counter =0;
	final static long MAX_NUM = Integer.MAX_VALUE;

	public SingleAndMultiThreadWorkCompare(long startRange, long endRange ) {
		this.startRange = startRange;
		this.endRange = endRange;

	}

	public void add(){
		for (long i = startRange; i < endRange; i++) {
			counter+=i;
		}
	}

	public static void singleThread(){
		long startTime = System.currentTimeMillis();
		SingleAndMultiThreadWorkCompare obj1 = new SingleAndMultiThreadWorkCompare(0,MAX_NUM);
		obj1.add();
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime-startTime;
		System.out.println("Start time = "+startTime+" endtime "+endTime+" Time taken by two threads"+timeTaken+" final Count"+obj1.counter);
	}

	public static void multiThread() throws InterruptedException {
		long startTime = System.currentTimeMillis();
		SingleAndMultiThreadWorkCompare obj = new SingleAndMultiThreadWorkCompare(0,MAX_NUM/2);
		SingleAndMultiThreadWorkCompare obj2 = new SingleAndMultiThreadWorkCompare((MAX_NUM/2)+1,MAX_NUM);

		Thread t1 = new Thread(()->{
			obj.add();
		});
		Thread t2 = new Thread(()->{
			obj2.add();
		});

		t1.start();
		t2.start();

		Thread.sleep(100);
		t1.join();
		t2.join();

		System.out.println("Count 1 "+obj.counter);
		System.out.println("Counter 2"+ obj2.counter);
		long finalCount = obj.counter+obj2.counter;
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime-startTime;
		System.out.println("Start time = "+startTime+" endtime "+endTime+" Time taken by two threads"+timeTaken+" final Count"+finalCount);

	}

	public static void main(String[] args) throws InterruptedException {
		singleThread();
		multiThread();
	}
}
