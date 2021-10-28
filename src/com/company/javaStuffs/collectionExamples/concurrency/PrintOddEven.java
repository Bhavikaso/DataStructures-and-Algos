package com.company.javaStuffs.collectionExamples.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintOddEven {

	//shared variable i
	int i;
	int n;

	PrintOddEven(int n){
		this.n=n;
	}

	public void printOdd() throws InterruptedException {
		synchronized (this) {
			while (i < n) {
				if(i%2==0)
				wait();
				else {
					System.out.println("Odd " + i);
					i++;
					notifyAll();
				}
			}
		}
	}

	public void printEven() throws InterruptedException {
		synchronized (this) {
			while (i < n) {
				if (i % 2 != 0)
					wait();
				else {
					System.out.println("even " + i);
					i++;
					notifyAll();
				}
			}
		}
	}

	public void printEvenOddervice(){
		Executor e = Executors.newFixedThreadPool(2);
		e.execute(() -> {
			try {
				printEven();
			}
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		});

		e.execute(() -> {
			try {
				printOdd();
			}
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		});
	}
	public static void main(String[] args) {
 			PrintOddEven printOddEven = new PrintOddEven(100);
 			printOddEven.printEvenOddervice();

	}

}
