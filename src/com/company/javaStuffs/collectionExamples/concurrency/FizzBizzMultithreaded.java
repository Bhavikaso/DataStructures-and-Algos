package com.company.javaStuffs.collectionExamples.concurrency;

import java.util.function.IntConsumer;

public class FizzBizzMultithreaded {
		private int n;

		public FizzBizzMultithreaded(int n) {
			this.n = n;
		}

		// printFizz.run() outputs "fizz".
		public void fizz(Runnable printFizz) throws InterruptedException {
				// if i is divisible by 3 and not 5,
			synchronized (this) {
				if(n%3==0 && n%5!=0)
					System.out.println("fizz");
			}
		}

		// printBuzz.run() outputs "buzz".
		public void buzz(Runnable printBuzz) throws InterruptedException {
			synchronized (this) {
				if(n%3!=0 && n%5==0)
					System.out.println("Buzz");
			}
		}

		// printFizzBuzz.run() outputs "fizzbuzz".
		public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
			synchronized (this) {
				if(n%3==0 && n%5==0)
					System.out.println("FizzBuzz");
			}
		}

		// printNumber.accept(x) outputs "x", where x is an integer.
		public void number(IntConsumer printNumber) throws InterruptedException {

		}
	}

