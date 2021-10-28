package com.company.javaStuffs.collectionExamples.concurrency;

public class ProducerConsumerExample {
	public static void main(String args[]) throws InterruptedException {
		//ProducerConsumer p1 = new ProducerConsumer();

		ProducerConsumerImproved p1 = new ProducerConsumerImproved();
		Thread t1 = new Thread(() -> {

			for (int i = 0; i < 100; i++) {
				try {
					p1.producer();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 100 ; i++) {
				try {
					p1.consumer();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}


		});

		t1.start();
		//Thread.sleep(1000);
		t2.start();


	}

}
